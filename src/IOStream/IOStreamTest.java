package IOStream;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class IOStreamTest extends JFrame implements ActionListener{
    //�½������ı���
    JTextArea content = new JTextArea();
    //�½�����
    JButton read = new JButton("Read File");
    JButton write = new JButton("Write File");
    //�½������ı���
    JTextField FileName = new JTextField(20);
    //�½���ǩ
    JLabel prompt = new JLabel("Enter Flie Name:",JLabel.RIGHT);
    //�½����
    JPanel commands = new JPanel();
    public IOStreamTest(){
        super("Flie Read & Write Example");
        //��Ӱ�����Ӧ
        read.addActionListener(this);
        write.addActionListener(this);
        //���������
        commands.setLayout(new GridLayout(2,2,1,1));
        commands.add(prompt);
        commands.add(FileName);
        commands.add(read);
        commands.add(write);
        //��ʼ������
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add("North",commands);
        this.getContentPane().add(new JScrollPane(content));
        this.getContentPane().add("Center",content);
    }
    private void writeTextFile(JTextArea content,String fileName){
        try{
            FileWriter outStream = new FileWriter(fileName);
            outStream.write(content.getText());
            outStream.close();
        }catch(IOException e){
            content.setText("IOERROR:" + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
    private void readTextFile(JTextArea content,String fileName){
        try{
            BufferedReader inStream = new BufferedReader(new FileReader((fileName)));
            String line = inStream.readLine();
            while(line != null){
                content.append(line + "\n");
                line = inStream.readLine();
            }
            inStream.close();
        }catch(FileNotFoundException e){
            content.setText("IOERROR:" + fileName + " Not Found\n" );
            e.printStackTrace();
        }catch (IOException e){
            content.setText("IOERROR:" + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent evt){
        String fileName = FileName.getText();
        if(evt.getSource() == read){
            content.setText("");
            readTextFile(content,fileName);
        }
        else{
            writeTextFile(content,fileName);
        }
    }
    public static void main(String[] args){
        IOStreamTest t1 = new IOStreamTest();
        t1.setSize(800,600);
        t1.setVisible(true);
        t1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
