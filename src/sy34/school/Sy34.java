package sy34.school;

import sy34.school.students.Student;
import sy34.school.teachers.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AHXSchoolManageSystem{
    JFrame f = new JFrame("学生信息管理系统");
    JPanel m = new JPanel();
    JButton stu = new JButton("学生");
    JButton tea = new JButton("教师");
}

public class Sy34 extends JFrame implements ActionListener {
    AHXSchoolManageSystem s = new AHXSchoolManageSystem();

    public Sy34(){
        super("学生信息管理");
        //添加按键响应
        s.stu.addActionListener(this);
        s.tea.addActionListener(this);
        //容器添加组件
        s.m.add(s.stu);
        s.m.add(s.tea);
        s.m.setLayout(new FlowLayout(FlowLayout.CENTER));
        s.f.add(s.m);
        s.f.setBounds(200,200,400,200);
        //可见
        s.f.setVisible(true);
        //检测关闭按键
        s.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //检测哪个按键
        if(e.getSource()==s.stu){
            //关闭主菜单可见性
            s.f.setVisible(false);
            Student stu = new Student();
            stu.showInformation();
        }
        else{
            //关闭主菜单可见性
            s.f.setVisible(false);
            Teacher tea = new Teacher();
            tea.showInformation();
        }
    }

    public static void main(String[] args) {
        Sy34 sy = new Sy34();
    }
}
