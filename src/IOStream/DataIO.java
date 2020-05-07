package IOStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class DataIO extends JFrame implements ActionListener {
    //�½������ı���
    private final JTextArea content = new JTextArea();
    //�½�����
    private final JButton read = new JButton("Read");
    private final JButton write = new JButton("Write");
    //�½������ı���
    private final JTextField name = new JTextField(10);
    //�½���ǩ
    private final JLabel prompt = new JLabel("File Name:",JLabel.RIGHT);
    //�½��������
    private final JPanel commands = new JPanel();
    public DataIO(){
        super("Data File Read And Write Example");
        //����¼���Ӧ��
        read.addActionListener(this);
        write.addActionListener(this);
        //���񲼾�
        commands.setLayout(new GridLayout(2,2,1,1));
        //������������
        commands.add(prompt);
        commands.add(name);
        commands.add(read);
        commands.add(write);
        content.setLineWrap(true);
        //����
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add("North",commands);
        this.getContentPane().add(new JScrollPane(content));
        this.getContentPane().add("Center",content);
    }
    private void readRecords(String fileName){
        try{
            try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))) {
                //������ı����д�ӡ��Ϣ
                content.setText("Name\tAge\tSalary\n");
                while (true) {
                    String name = in.readUTF();
                    int age = in.readInt();
                    double pay = in.readDouble();
                    content.append(name + "\t" + age + "\t" + pay + "\n");
                }
            } catch (EOFException ignored) {
                //���ļ���ȡ��ɺ���׳�EOFException�쳣������ִ���κβ���
            }
        }catch (FileNotFoundException e){
            content.setText("IOERROR:File Not Found:" + fileName + "\n");
        }catch (IOException e){
            //���ļ�Ϊ��ʱ���׳�IOException�쳣
            content.setText("IOERROR:" + e.getMessage() + "\n");
        }
    }
    private void writeRecords(String fileName){
        try{
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
            for(int i=0;i<5;i++){
                String name = "Name" + i;
                out.writeUTF("Name" + i);
                //�����������
                out.writeInt((int)(20 + Math.random()*25));
                out.writeDouble(2500 + Math.random() * 2500);
            }
            out.close();
        }catch(IOException e){
            //���ļ�Ϊ��ʱ���׳�IOException�쳣
            content.setText("IOERROR:" + e.getMessage() + "\n");
        }
    }
    @Override
    public void actionPerformed(ActionEvent evt) {
        String fileName = name.getText();
        //��ⰴ��
        if(evt.getSource() == read){
            readRecords(fileName);
        }
        else{
            writeRecords(fileName);
        }
    }
    public static void main(String[] args){
        //ʵ��������
        DataIO dio = new DataIO();
        //���ô��ڴ�С
        dio.setSize(800,600);
        //���ÿɼ�״̬
        dio.setVisible(true);
        //���ô��ڹر���Ӧ
        dio.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
