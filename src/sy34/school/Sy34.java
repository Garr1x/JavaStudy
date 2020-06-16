package sy34.school;

import sy34.school.students.Student;
import sy34.school.teachers.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AHXSchoolManageSystem{
    JFrame f = new JFrame("ѧ����Ϣ����ϵͳ");
    JPanel m = new JPanel();
    JButton stu = new JButton("ѧ��");
    JButton tea = new JButton("��ʦ");
}

public class Sy34 extends JFrame implements ActionListener {
    AHXSchoolManageSystem s = new AHXSchoolManageSystem();

    public Sy34(){
        super("ѧ����Ϣ����");
        //��Ӱ�����Ӧ
        s.stu.addActionListener(this);
        s.tea.addActionListener(this);
        //����������
        s.m.add(s.stu);
        s.m.add(s.tea);
        s.m.setLayout(new FlowLayout(FlowLayout.CENTER));
        s.f.add(s.m);
        s.f.setBounds(200,200,400,200);
        //�ɼ�
        s.f.setVisible(true);
        //���رհ���
        s.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //����ĸ�����
        if(e.getSource()==s.stu){
            //�ر����˵��ɼ���
            s.f.setVisible(false);
            Student stu = new Student();
            stu.showInformation();
        }
        else{
            //�ر����˵��ɼ���
            s.f.setVisible(false);
            Teacher tea = new Teacher();
            tea.showInformation();
        }
    }

    public static void main(String[] args) {
        Sy34 sy = new Sy34();
    }
}
