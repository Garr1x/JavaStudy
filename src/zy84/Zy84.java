package zy84;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Garr1X_Bo
 */

class Student{
    private String name;
    private double ch,math,es,sci,sum,avg;
    public Student(String name,double ch,double math,double es,double sci){
        this.name = name;
        this.ch = ch;
        this.math = math;
        this.es = es;
        this.sci = sci;
        sum = ch + math + es + sci;
        avg = sum/4;
    }

    public double getCh() {
        return ch;
    }

    public double getMath() {
        return math;
    }

    public double getEs() {
        return es;
    }

    public double getSci() {
        return sci;
    }

    public double getSum() {
        return sum;
    }

    public String getStu(){
        return name + "\t" + ch + "\t" + math + "\t" + es + "\t" + sci + "\t" + sum + "\t" + avg;
    }
}

public class Zy84 {
    public static void main(String[] args) throws IOException {
        //�洢Student��
        List<Student> stu = new ArrayList<>();
        File i = new File("D:\\JAVAProjects\\JavaStudy\\file\\StuScore.txt");
        File o = new File("D:\\JAVAProjects\\JavaStudy\\file\\ClassScore.txt");
        BufferedReader in = new BufferedReader(new FileReader(i));
        //��һ�в������� ������ѭ����ȡǰ��ȥ����һ��
        String s = in.readLine();
        while((s=in.readLine())!=null){
            //�ĵ������ݰ���һ���Ʊ���ĸ�ʽ�ָ�
            String[] n = s.split("\t");
            double a=Double.parseDouble(n[1]);
            double b=Double.parseDouble(n[2]);
            double c=Double.parseDouble(n[3]);
            double d=Double.parseDouble(n[4]);
            Student e = new Student(n[0],a,b,c,d);
            //����ȡ��ɵ�һ����Ϣ���뵽List����
            stu.add(e);
        }
        BufferedWriter out = new BufferedWriter(new FileWriter(o,false));
        out.write("����\t����\t��ѧ\tӢ��\t��ѧ\t�ܷ�\tƽ����\n");
        //��¼List��Student��ĸ��� �Լ�ÿһ�Ƶİ༶�ܷ����Լ���ƽ����
        double count=0,sum=0,chs=0,maths=0,ess=0,scis=0;
        for(Student e:stu){
            out.write(e.getStu());
            out.newLine();
            out.flush();
            chs+=e.getCh();
            maths+=e.getMath();
            ess+=e.getEs();
            scis+=e.getSci();
            sum+=e.getSum();
            count+=1;
        }
        out.write("ƽ��\t" + chs/count + "\t" + maths/count + "\t" + ess/count + "\t" + scis/count + "\t" + sum/count);

        in.close();
        out.close();

        System.out.println("Statistics completed!!!");
    }
}
