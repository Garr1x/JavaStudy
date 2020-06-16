package sy34.school.students;

import javafx.embed.swing.JFXPanel;
import sun.plugin2.message.ShowDocumentMessage;
import sy34.school.SchoolManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class StuInfo{
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
}

public class Student extends JFrame implements SchoolManager,ActionListener {
    StuInfo s = new StuInfo();

    public Student(){
        super("学生信息录入");
        //添加组件
        s.sb.addActionListener(this);
        s.sjp1.add(s.sl1);
        s.sjp1.add(s.stf1);
        s.sjp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        s.sjp2.add(s.sl2);
        s.sjp2.add(s.stf2);
        s.sjp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        s.sjp3.add(s.sl3);
        s.sjp3.add(s.stf3);
        s.sjp3.setLayout(new FlowLayout(FlowLayout.CENTER));
        s.sjp4.add(s.sl4);
        s.sjp4.add(s.stf4);
        s.sjp4.setLayout(new FlowLayout(FlowLayout.CENTER));
        s.sjp5.add(s.sl5);
        s.sjp5.add(s.stf5);
        s.sjp5.setLayout(new FlowLayout(FlowLayout.CENTER));
        s.sjp6.add(s.sl6);
        s.sjp6.add(s.stf6);
        s.sjp6.setLayout(new FlowLayout(FlowLayout.CENTER));
        //sjp7.add(sb);
        //sjp7.setLayout(new FlowLayout((FlowLayout.CENTER)));
        s.sf.setLayout(new GridLayout(7,1));
        s.sf.add(s.sjp1);
        s.sf.add(s.sjp2);
        s.sf.add(s.sjp3);
        s.sf.add(s.sjp4);
        s.sf.add(s.sjp5);
        s.sf.add(s.sjp6);
        s.sf.add(s.sb,BorderLayout.SOUTH);
        s.sf.setBounds(200,200,800,400);
        //sf.pack();
        //可见
        s.sf.setVisible(true);
        //检测关闭按钮
        s.sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void showInformation() {
        try{
            System.out.println("现有以下学生信息:");
            char c[] = new char[1000];
            FileReader fr = new FileReader("D:\\JAVAProjects\\JavaStudy\\file\\Students.txt");
            int num = fr.read(c);
            String str = new String(c,0,num);
            System.out.println(str);
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addInformation() {
        try{
            FileWriter outStream = new FileWriter("D:\\JAVAProjects\\JavaStudy\\file\\Students.txt",true);
            outStream.write("院系：" + s.stf1.getText() + "\t专业：" + s.stf2.getText() + "\t班级：" + s.stf3.getText()
                    + "\t学号：" + s.stf4.getText() + "\t姓名：" + s.stf5.getText() + "\t年龄：" + s.stf6.getText() + "\n");
            outStream.close();
            System.out.println("录入成功！");
            showInformation();
        }catch (IOException e){
            System.out.println("Can Not Find the File!!!");
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==s.sb){
            addInformation();
        }
    }
}
