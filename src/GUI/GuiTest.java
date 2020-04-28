package GUI;

import java.awt.*;
import java.awt.event.*;

public class GuiTest extends Frame implements ActionListener {
    Frame f = new Frame("Test");                        //新建窗口
    private Button ok = new Button("Enter");            //新建按钮
    private Button bb = new Button("BB");               //新建按钮
    private TextField tf = new TextField(30);       //新建文本框
    public void init(){
        ok.addActionListener(this);                         //添加事件监控器
        bb.addActionListener(this);
        f.add(tf);                                              //窗口中添加
        f.add(ok,BorderLayout.SOUTH);
        f.add(bb,BorderLayout.NORTH);
        f.pack();                                               //自动调整框架位置
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){                 //重写actionPerformed方法
        String name = e.getActionCommand();                     //获取按键名称
        if(name.equals("Enter")){
            System.out.println("User Clicked the OK Button");
            tf.setText("Hello World");
        }
        else if(name.equals("BB")){
            System.out.println("BB");
            tf.setText("BB");
        }
    }
    public static void main(String[] args){
        new GuiTest().init();
    }
}
