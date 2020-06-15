package ForTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

interface A{

    double fun(double x,double y);

}

class B implements A{

    @Override
    public double fun(double x, double y){

        return x*y;

    }

    int add(int x,int y){

        return x+y;

    }

}

public class Test {

    /*public static void main(String args[]){

        A a=new B();

        System.out.println(a.fun(3,5));

        B b=(B)a;

        System.out.println(b.add(3,5));

        int t=1000;

        System.out.println(t+1000);

    }*/
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("请输入一个字符串：");

        String s = br.readLine();

        System.out.println("输入的字符串是：" + s);

    }
}

/*
class T1 {
    private String privateName;
    public String publicName;
    protected String protectedName;
    String defaultName;
}

class T2 extends T1{
    public void test(){
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(defaultName);
        System.out.println(privateName);
    }
}
*/
