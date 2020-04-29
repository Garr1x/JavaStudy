package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class Teacher extends Person{
    private String teachClass;
    private double saraly;
    Teacher(String name, int age,String teachClass,double saraly) {
        super(name, age);
        this.teachClass = teachClass;
        this.saraly = saraly;
    }
    public String getTeachClass(){
        return teachClass;
    }
    public double getSaraly(){
        return saraly;
    }
}

class Student extends Person{
    private String major;
    private int snum;
    Student(String name, int age,String major,int snum) {
        super(name, age);
        this.major = major;
        this.snum = snum;
    }
    public String getMajor(){
        return major;
    }
    public int getSnum(){
        return snum;
    }
}

public class GuiTest extends Frame implements ActionListener {
    //新建窗口
    JFrame f = new JFrame("Test");
    //新建按钮
    private JButton Stu = new JButton("Student");
    //新建按钮
    private JButton Tea = new JButton("Teacher");
    //新建文本框
    private JTextArea ta = new JTextArea(5,5);
    //新建菜单栏
    private JMenuBar mb = new JMenuBar();
    //新建菜单
    private JMenu m1 = new JMenu("m1");
    private JMenu m2 = new JMenu("m2");
    private JMenu m3 = new JMenu("m3");
    private JMenu m4 = new JMenu("m4");
    //新建菜单项
    private JMenuItem m11 = new JMenu("F");
    private JMenuItem m12 = new JMenu("C");
    public void init(){
        //添加事件监控器
        Tea.addActionListener(this);
        Stu.addActionListener(this);
        /*
        m1.addActionListener(this);
        m11.addActionListener(this);
        m12.addActionListener(this);
         */
        //菜单栏中加入菜单
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        //菜单中加入菜单项
        m1.add(m11);
        m1.add(m12);
        //窗口中添加
        f.setJMenuBar(mb);
        f.add(ta);
        f.add(Tea,BorderLayout.SOUTH);
        f.add(Stu,BorderLayout.NORTH);
        //自动调整框架位置
        f.pack();
        f.setVisible(true);
    }
    @Override
    //重写actionPerformed方法
    public void actionPerformed(ActionEvent e){
        String name = e.getActionCommand();
        Student s = new Student("Zhong",20,"CS&T",111);
        Teacher t = new Teacher("Liu",46,"Java",12120);
        //获取按键名称
        if("Student".equals(name)){
            ta.setText("Name:" + s.getName() + "\nAge:" + s.getAge() + "\nMajor:" + s.getMajor() + "\nStuNum:" + s.getSnum());
        }
        else if("Teacher".equals(name)){
            ta.setText("Name:" + t.getName() + "\nAge:" + t.getAge() + "\nTeachClass:" + t.getTeachClass() + "\nSaraly:" + t.getSaraly());
        }
        /*未完成
        else if(e.getSource()==m11){
            System.out.println("m11");
            System.exit(0);
        }
        else if(e.getSource()==m12){
            System.out.println("m12");
            System.exit(-1);
        }
        */
    }
    public static void main(String[] args){
        new GuiTest().init();
    }
}
