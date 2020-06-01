package zy84;

import java.io.*;

/**
 * @author Garr1X_Bo
 */
public class Zy84 {
    public static void main(String[] args){
        try{
            FileReader in = new FileReader("D:\\JAVAProjects\\JavaStudy\\file\\Score.txt");
            FileWriter out = new FileWriter("D:\\JAVAProjects\\JavaStudy\\file\\CopyScore.txt",false);

            char c[] = new char[500];
            int num = in.read(c);
            String str = new String(c,0,num);
            out.write(c);

            in.close();
            out.close();

            System.out.println("Copy Done!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
