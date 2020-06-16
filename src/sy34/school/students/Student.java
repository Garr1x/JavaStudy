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
    //����
    JFrame sf = new JFrame();
    //��ť
    JButton sb = new JButton("¼��");
    //��ǩ
    JLabel sl1 = new JLabel("Ժϵ��");
    JLabel sl2 = new JLabel("רҵ��");
    JLabel sl3 = new JLabel("�༶��");
    JLabel sl4 = new JLabel("ѧ�ţ�");
    JLabel sl5 = new JLabel("������");
    JLabel sl6 = new JLabel("���䣺");
    //�����ı���
    JTextField stf1 = new JTextField(12);
    JTextField stf2 = new JTextField(12);
    JTextField stf3 = new JTextField(12);
    JTextField stf4 = new JTextField(12);
    JTextField stf5 = new JTextField(12);
    JTextField stf6 = new JTextField(12);
    //���
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
        super("ѧ����Ϣ¼��");
        //������
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
        //�ɼ�
        s.sf.setVisible(true);
        //���رհ�ť
        s.sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void showInformation() {
        try{
            System.out.println("��������ѧ����Ϣ:");
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
            outStream.write("Ժϵ��" + s.stf1.getText() + "\tרҵ��" + s.stf2.getText() + "\t�༶��" + s.stf3.getText()
                    + "\tѧ�ţ�" + s.stf4.getText() + "\t������" + s.stf5.getText() + "\t���䣺" + s.stf6.getText() + "\n");
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
        if(e.getSource()==s.sb){
            addInformation();
        }
    }
}
