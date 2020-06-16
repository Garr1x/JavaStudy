package sy34.school.teachers;

import sy34.school.SchoolManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class TeaInfo{
    JFrame tf = new JFrame();
    //��ť
    JButton tb = new JButton("¼��");
    //��ǩ
    JLabel tl1 = new JLabel("Ժϵ��");
    JLabel tl2 = new JLabel("רҵ��");
    JLabel tl3 = new JLabel("���ţ�");
    JLabel tl4 = new JLabel("������");
    JLabel tl5 = new JLabel("���̿γ̣�");
    //�����ı���
    JTextField ttf1 = new JTextField(12);
    JTextField ttf2 = new JTextField(12);
    JTextField ttf3 = new JTextField(12);
    JTextField ttf4 = new JTextField(12);
    JTextField ttf5 = new JTextField(12);
    //���
    JPanel tjp1 = new JPanel();
    JPanel tjp2 = new JPanel();
    JPanel tjp3 = new JPanel();
    JPanel tjp4 = new JPanel();
    JPanel tjp5 = new JPanel();
    //JPanel tjp6 = new JPanel();
}

public class Teacher extends JFrame implements SchoolManager, ActionListener {
    TeaInfo t = new TeaInfo();

    public Teacher() {
        super("ѧ����Ϣ¼��");
        //������
        t.tb.addActionListener(this);
        t.tjp1.add(t.tl1);
        t.tjp1.add(t.ttf1);
        t.tjp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        t.tjp2.add(t.tl2);
        t.tjp2.add(t.ttf2);
        t.tjp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        t.tjp3.add(t.tl3);
        t.tjp3.add(t.ttf3);
        t.tjp3.setLayout(new FlowLayout(FlowLayout.CENTER));
        t.tjp4.add(t.tl4);
        t.tjp4.add(t.ttf4);
        t.tjp4.setLayout(new FlowLayout(FlowLayout.CENTER));
        t.tjp5.add(t.tl5);
        t.tjp5.add(t.ttf5);
        t.tjp5.setLayout(new FlowLayout(FlowLayout.CENTER));
        //tjp6.add(tb);
        //tjp6.setLayout(new FlowLayout(FlowLayout.CENTER));
        t.tf.setLayout(new GridLayout(6, 1));
        t.tf.add(t.tjp1);
        t.tf.add(t.tjp2);
        t.tf.add(t.tjp3);
        t.tf.add(t.tjp4);
        t.tf.add(t.tjp5);
        //f.add(tjp6);
        t.tf.add(t.tb,BorderLayout.SOUTH);
        t.tf.setBounds(200, 200, 800, 600);
        //tf.pack();
        //�ɼ�
        t.tf.setVisible(true);
        //���رհ�ť
        t.tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void showInformation() {
            try{
                System.out.println("�������½�ʦ��Ϣ:");
                char c[] = new char[1000];
                FileReader fr = new FileReader("D:\\JAVAProjects\\JavaStudy\\file\\Teachers.txt");
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
            FileWriter outStream = new FileWriter("D:\\JAVAProjects\\JavaStudy\\file\\Teachers.txt",true);
            outStream.write("Ժϵ��" + t.ttf1.getText() + "\tרҵ��" + t.ttf2.getText() + "\t���ţ�" + t.ttf3.getText()
                    + "\t������" + t.ttf4.getText() + "\t���̿γ̣�" + t.ttf5.getText() + "\n");
            outStream.close();
            System.out.println("¼��ɹ���");
            showInformation();
        }catch (IOException e){
            System.out.println("Can Not Find the File!!!");
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==t.tb){
            addInformation();
        }
    }
}
