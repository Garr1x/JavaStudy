package IOStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class DataIO extends JFrame implements ActionListener {
    //新建多行文本框
    private final JTextArea content = new JTextArea();
    //新建按键
    private final JButton read = new JButton("Read");
    private final JButton write = new JButton("Write");
    //新建单行文本框
    private final JTextField name = new JTextField(10);
    //新建标签
    private final JLabel prompt = new JLabel("File Name:",JLabel.RIGHT);
    //新建面板容器
    private final JPanel commands = new JPanel();
    public DataIO(){
        super("Data File Read And Write Example");
        //添加事件响应器
        read.addActionListener(this);
        write.addActionListener(this);
        //网格布局
        commands.setLayout(new GridLayout(2,2,1,1));
        //向容器添加组件
        commands.add(prompt);
        commands.add(name);
        commands.add(read);
        commands.add(write);
        content.setLineWrap(true);
        //布局
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add("North",commands);
        this.getContentPane().add(new JScrollPane(content));
        this.getContentPane().add("Center",content);
    }
    private void readRecords(String fileName){
        try{
            try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))) {
                //向多行文本框中打印信息
                content.setText("Name\tAge\tSalary\n");
                while (true) {
                    String name = in.readUTF();
                    int age = in.readInt();
                    double pay = in.readDouble();
                    content.append(name + "\t" + age + "\t" + pay + "\n");
                }
            } catch (EOFException ignored) {
                //当文件读取完成后会抛出EOFException异常，但不执行任何操作
            }
        }catch (FileNotFoundException e){
            content.setText("IOERROR:File Not Found:" + fileName + "\n");
        }catch (IOException e){
            //当文件为空时会抛出IOException异常
            content.setText("IOERROR:" + e.getMessage() + "\n");
        }
    }
    private void writeRecords(String fileName){
        try{
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
            for(int i=0;i<5;i++){
                String name = "Name" + i;
                out.writeUTF("Name" + i);
                //随机输入数字
                out.writeInt((int)(20 + Math.random()*25));
                out.writeDouble(2500 + Math.random() * 2500);
            }
            out.close();
        }catch(IOException e){
            //当文件为空时会抛出IOException异常
            content.setText("IOERROR:" + e.getMessage() + "\n");
        }
    }
    @Override
    public void actionPerformed(ActionEvent evt) {
        String fileName = name.getText();
        //检测按键
        if(evt.getSource() == read){
            readRecords(fileName);
        }
        else{
            writeRecords(fileName);
        }
    }
    public static void main(String[] args){
        //实例化对象
        DataIO dio = new DataIO();
        //设置窗口大小
        dio.setSize(800,600);
        //设置可见状态
        dio.setVisible(true);
        //设置窗口关闭响应
        dio.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
