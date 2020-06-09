package zy934;

import javax.swing.*;
import java.awt.*;

/**
 * @author Garr1X_Bo
 */

public class Zy934 extends Frame{
    JFrame f = new JFrame("学生信息");
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    JPanel jp4 = new JPanel();
    JPanel jp5 = new JPanel();
    JPanel jp6 = new JPanel();
    private final JTextField co = new JTextField(5);
    private final JTextField maj = new JTextField(5);
    private final JTextField cla = new JTextField(5);
    private final JTextField num = new JTextField(5);
    private final JTextField name = new JTextField(5);
    private final JLabel col = new JLabel("院系：");
    private final JLabel majl = new JLabel("专业：");
    private final JLabel clal = new JLabel("班级：");
    private final JLabel numl = new JLabel("学号：");
    private final JLabel namel = new JLabel("姓名：");
    private final JButton push = new JButton("提交");
    private final JButton cancel = new JButton("取消");

    public void init(){
        jp1.add(col);
        jp1.add(co);
        jp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp2.add(majl);
        jp2.add(maj);
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp3.add(clal);
        jp3.add(cla);
        jp3.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp4.add(numl);
        jp4.add(num);
        jp4.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp5.add(namel);
        jp5.add(name);
        jp5.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp6.add(push);
        jp6.add(cancel);
        jp6.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setLayout(new GridLayout(6,1));
        f.add(jp1);
        f.add(jp2);
        f.add(jp3);
        f.add(jp4);
        f.add(jp5);
        f.add(jp6);
        f.setBounds(200,200,400,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Zy934().init();
    }
}
