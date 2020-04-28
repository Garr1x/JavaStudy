package GUI;

import java.awt.*;
import java.awt.event.*;

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
    Frame f = new Frame("Test");                        //新建窗口
    private Button Stu = new Button("Student");            //新建按钮
    private Button Tea = new Button("Teacher");               //新建按钮
    private TextArea ta = new TextArea(5,5);       //新建文本框
    public void init(){
        Tea.addActionListener(this);                         //添加事件监控器
        Stu.addActionListener(this);
        f.add(ta);                                              //窗口中添加
        f.add(Tea,BorderLayout.SOUTH);
        f.add(Stu,BorderLayout.NORTH);
        f.pack();                                               //自动调整框架位置
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){                 //重写actionPerformed方法
        String name = e.getActionCommand();
        Student s = new Student("Zhong",20,"CS&T",111);
        Teacher t = new Teacher("Liu",46,"Java",12120);//获取按键名称
        if("Student".equals(name)){
            ta.setText("Name:" + s.getName() + "\nAge:" + s.getAge() + "\nMajor:" + s.getMajor() + "\nStuNum:" + s.getSnum());
        }
        else if("Teacher".equals(name)){
            ta.setText("Name:" + t.getName() + "\nAge:" + t.getAge() + "\nTeachClass:" + t.getTeachClass() + "\nSaraly:" + t.getSaraly());
        }
    }
    public static void main(String[] args){
        new GuiTest().init();
    }
}
