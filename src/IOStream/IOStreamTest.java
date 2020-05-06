package IOStream;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class IOStreamTest extends JFrame implements ActionListener{
    //新建多行文本框
    JTextArea content = new JTextArea();
    //新建按键
    JButton read = new JButton("Read File");
    JButton write = new JButton("Write File");
    //新建单行文本框
    JTextField FileName = new JTextField(20);
    //新建标签
    JLabel prompt = new JLabel("Enter Flie Name:",JLabel.RIGHT);
    //新建面板
    JPanel commands = new JPanel();
    public IOStreamTest(){
        super("Flie Read & Write Example");
        //添加按键响应
        read.addActionListener(this);
        write.addActionListener(this);
        //面板加载组件
        commands.setLayout(new GridLayout(2,2,1,1));
        commands.add(prompt);
        commands.add(FileName);
        commands.add(read);
        commands.add(write);
        //初始化容器
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
