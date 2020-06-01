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
        //存储Student类
        List<Student> stu = new ArrayList<>();
        File i = new File("D:\\JAVAProjects\\JavaStudy\\file\\StuScore.txt");
        File o = new File("D:\\JAVAProjects\\JavaStudy\\file\\ClassScore.txt");
        BufferedReader in = new BufferedReader(new FileReader(i));
        //第一行不是数据 所以在循环读取前先去掉第一行
        String s = in.readLine();
        while((s=in.readLine())!=null){
            //文档中数据按照一个制表符的格式分割
            String[] n = s.split("\t");
            double a=Double.parseDouble(n[1]);
            double b=Double.parseDouble(n[2]);
            double c=Double.parseDouble(n[3]);
            double d=Double.parseDouble(n[4]);
            Student e = new Student(n[0],a,b,c,d);
            //将读取完成的一行信息加入到List表中
            stu.add(e);
        }
        BufferedWriter out = new BufferedWriter(new FileWriter(o,false));
        out.write("姓名\t语文\t数学\t英语\t科学\t总分\t平均分\n");
        //记录List中Student类的个数 以及每一科的班级总分用以计算平均分
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
        out.write("平均\t" + chs/count + "\t" + maths/count + "\t" + ess/count + "\t" + scis/count + "\t" + sum/count);

        in.close();
        out.close();

        System.out.println("Statistics completed!!!");
    }
}
