package sy34.school.teachers;

import sy34.school.SchoolManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Teacher extends JFrame implements SchoolManager, ActionListener {
    JFrame tf = new JFrame();
    //按钮
    JButton tb = new JButton("录入");
    //标签
    JLabel tl1 = new JLabel("院系：");
    JLabel tl2 = new JLabel("专业：");
    JLabel tl3 = new JLabel("工号：");
    JLabel tl4 = new JLabel("姓名：");
    JLabel tl5 = new JLabel("所教课程：");
    //单行文本框
    JTextField ttf1 = new JTextField(12);
    JTextField ttf2 = new JTextField(12);
    JTextField ttf3 = new JTextField(12);
    JTextField ttf4 = new JTextField(12);
    JTextField ttf5 = new JTextField(12);
    //面板
    JPanel tjp1 = new JPanel();
    JPanel tjp2 = new JPanel();
    JPanel tjp3 = new JPanel();
    JPanel tjp4 = new JPanel();
    JPanel tjp5 = new JPanel();
    //JPanel tjp6 = new JPanel();

    public Teacher() {
        super("学生信息录入");
        //添加组件
        tb.addActionListener(this);
        tjp1.add(tl1);
        tjp1.add(ttf1);
        tjp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        tjp2.add(tl2);
        tjp2.add(ttf2);
        tjp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        tjp3.add(tl3);
        tjp3.add(ttf3);
        tjp3.setLayout(new FlowLayout(FlowLayout.CENTER));
        tjp4.add(tl4);
        tjp4.add(ttf4);
        tjp4.setLayout(new FlowLayout(FlowLayout.CENTER));
        tjp5.add(tl5);
        tjp5.add(ttf5);
        tjp5.setLayout(new FlowLayout(FlowLayout.CENTER));
        //tjp6.add(tb);
        //tjp6.setLayout(new FlowLayout(FlowLayout.CENTER));
        tf.setLayout(new GridLayout(6, 1));
        tf.add(tjp1);
        tf.add(tjp2);
        tf.add(tjp3);
        tf.add(tjp4);
        tf.add(tjp5);
        //f.add(tjp6);
        tf.add(tb,BorderLayout.SOUTH);
        tf.setBounds(200, 200, 800, 600);
        //tf.pack();
        //可见
        tf.setVisible(true);
        //检测关闭按钮
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void showInformation() {

    }

    @Override
    public void addInformation() {
        try{
            FileWriter outStream = new FileWriter("D:\\JAVAProjects\\JavaStudy\\file\\Teachers.txt",true);
            outStream.write("院系：" + ttf1.getText() + "\t专业：" + ttf2.getText() + "\t工号：" + ttf3.getText()
                    + "\t姓名：" + ttf4.getText() + "\t所教课程：" + ttf5.getText() + "\n");
            outStream.close();
        }catch (IOException e){
            System.out.println("Can Not Find the File!!!");
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==tb){
            addInformation();
        }
    }
}
