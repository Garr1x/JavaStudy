package sy34.school.students;

import javafx.embed.swing.JFXPanel;
import sy34.school.SchoolManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Student extends JFrame implements SchoolManager,ActionListener {
    //界面
    JFrame sf = new JFrame();
    //按钮
    JButton sb = new JButton("录入");
    //标签
    JLabel sl1 = new JLabel("院系：");
    JLabel sl2 = new JLabel("专业：");
    JLabel sl3 = new JLabel("班级：");
    JLabel sl4 = new JLabel("学号：");
    JLabel sl5 = new JLabel("姓名：");
    JLabel sl6 = new JLabel("年龄：");
    //单行文本框
    JTextField stf1 = new JTextField(12);
    JTextField stf2 = new JTextField(12);
    JTextField stf3 = new JTextField(12);
    JTextField stf4 = new JTextField(12);
    JTextField stf5 = new JTextField(12);
    JTextField stf6 = new JTextField(12);
    //面板
    JPanel sjp1 = new JPanel();
    JPanel sjp2 = new JPanel();
    JPanel sjp3 = new JPanel();
    JPanel sjp4 = new JPanel();
    JPanel sjp5 = new JPanel();
    JPanel sjp6 = new JPanel();
    //JPanel sjp7 = new JPanel();

    public Student(){
        super("学生信息录入");
        //添加组件
        sb.addActionListener(this);
        sjp1.add(sl1);
        sjp1.add(stf1);
        sjp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        sjp2.add(sl2);
        sjp2.add(stf2);
        sjp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        sjp3.add(sl3);
        sjp3.add(stf3);
        sjp3.setLayout(new FlowLayout(FlowLayout.CENTER));
        sjp4.add(sl4);
        sjp4.add(stf4);
        sjp4.setLayout(new FlowLayout(FlowLayout.CENTER));
        sjp5.add(sl5);
        sjp5.add(stf5);
        sjp5.setLayout(new FlowLayout(FlowLayout.CENTER));
        sjp6.add(sl6);
        sjp6.add(stf6);
        sjp6.setLayout(new FlowLayout(FlowLayout.CENTER));
        //sjp7.add(sb);
        //sjp7.setLayout(new FlowLayout((FlowLayout.CENTER)));
        sf.setLayout(new GridLayout(7,1));
        sf.add(sjp1);
        sf.add(sjp2);
        sf.add(sjp3);
        sf.add(sjp4);
        sf.add(sjp5);
        sf.add(sjp6);
        sf.add(sb,BorderLayout.SOUTH);
        sf.setBounds(200,200,800,400);
        //sf.pack();
        //可见
        sf.setVisible(true);
        //检测关闭按钮
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void showInformation() {

    }

    @Override
    public void addInformation() {
        try{
            FileWriter outStream = new FileWriter("D:\\JAVAProjects\\JavaStudy\\file\\Students.txt",true);
            outStream.write("院系：" + stf1.getText() + "\t专业：" + stf2.getText() + "\t班级：" + stf3.getText()
                    + "\t学号：" + stf4.getText() + "\t姓名：" + stf5.getText() + "\t年龄：" + stf6.getText() + "\n");
            outStream.close();
        }catch (IOException e){
            System.out.println("Can Not Find the File!!!");
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sb){
            addInformation();
        }
    }
}
