package ForTest;

interface A{

    double fun(double x,double y);

}

class B implements A{

    public double fun(double x,double y){

        return x*y;

    }

    int add(int x,int y){

        return x+y;

    }

}

public class Test{

    public static void main(String args[]){

        A a=new B();

        System.out.println(a.fun(3,5));

        B b=(B)a;

        System.out.println(b.add(3,5));

    }

}
