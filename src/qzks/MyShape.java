package qzks;

import java.util.Scanner;

class Shape{
    private double radium;

    public double getRadium() {
        return radium;
    }

    public void setRadium(double radium) {
        this.radium = radium;
    }

    public double getArea(){
        return radium*radium*Math.PI;
    }

    public double getCircum(){
        return radium*2*Math.PI;
    }
}

public class MyShape {
    public static void main(String[] args){
        Shape s = new Shape();
        Scanner sc = new Scanner(System.in);
        s.setRadium(sc.nextDouble());
        sc.close();
        if(s.getRadium()<5){
            System.out.println("�뾶Ϊ" + s.getRadium() + "cm��Բ���Ϊ" + s.getArea());
        }
        else{
            System.out.println("�뾶Ϊ" + s.getRadium() + "cm��Բ�ܳ�Ϊ" + s.getCircum());
        }
    }
}





