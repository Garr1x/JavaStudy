package IoTest;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class IoTest extends JFrame implements ActionListener {
    JTextArea content = new JTextArea();
    JButton read = new JButton("Read file"),write = new JButton("Write file");
    JTextField filename = new JTextField(20);
    JLabel prompt = new JLabel("Enter file name:",JLabel.RIGHT);
    JPanel commands = new JPanel();
    public IoTest(){                                                //构造方法
        super("Text file reading and writing examples");       //设置窗体标题
        read.addActionListener(this);
        write.addActionListener(this);
        commands.setLayout(new GridLayout(2,2,1,1));        //设置面板布局
        commands.add(prompt);
        commands.add(filename);
        commands.add(read);
        commands.add(write);
        //content.setLineWrap(true);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add("North",commands);
        this.getContentPane().add(new JScrollPane(content));
        this.getContentPane().add("Center",content);
    }//TextIO()
    private void writeTextFile(JTextArea content, String fileName){
        try{
            FileWriter outStream = new FileWriter(fileName);
            outStream.write(content.getText());
            outStream.close();
        }
        catch(IOException e){
            content.setText("IOERROR：" + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }//writeTextFlie()
    private void readTextFile(JTextArea content,String fileName){
        try{
            BufferedReader inStream = new BufferedReader(new FileReader(fileName)); //创建并打开流
            String line = inStream.readLine();                                      //读一行
            while(line != null){                                                    //判断是否读完
                content.append(line + "\n");                                        //显示一行
                line = inStream.readLine();                                         //读下一行
            }
            inStream.close();
        }
        catch(FileNotFoundException e){
            content.setText("IOERROR:" + fileName + " NOT Found\n");
            e.printStackTrace();
        }
        catch (IOException e){
            content.setText("IOERROR:" + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }//readTextFlie()
    @Override
    public void actionPerformed(ActionEvent evt){
        String fileName = filename.getText();
        if(evt.getSource() == read){
            content.setText("");
            readTextFile(content,fileName);
        }
        else {
            writeTextFile(content,fileName);
        }//actionPerformed()
    }
    public static void main(String[] arg){
        IoTest tf1 = new IoTest();
        tf1.setSize(400,200);
        tf1.setVisible(true);
        tf1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}