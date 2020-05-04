/*
Not Runable????
Bo____2020.5.4
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PtokgConverter{
    public static double poundToKg(double pounds){
        return pounds*0.45;
    }
}

public class PtoKg extends JFrame implements ActionListener {
    private JLabel prompt = new JLabel("Pounds:");
    private JTextField input = new JTextField(6);
    private JTextArea display = new JTextArea(10,20);
    private  JButton convert = new JButton("Convert!");
    public void converter(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(prompt);
        getContentPane().add(input);
        getContentPane().add(convert);
        getContentPane().add(display);
        display.setLineWrap(true);
        display.setEditable(false);
        convert.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        double pounds = Double.valueOf(input.getText()).doubleValue();
        double kg = PtokgConverter.poundToKg(pounds);
        display.append(pounds + "Pounds = " + kg + "Kg\n");
    }
    public static void main(String[] args){
        PtoKg f = new PtoKg();
        f.setSize(400,300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
