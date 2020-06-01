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
            System.out.println("半径为" + s.getRadium() + "cm的圆面积为" + s.getArea());
        }
        else{
            System.out.println("半径为" + s.getRadium() + "cm的圆周长为" + s.getCircum());
        }
    }
}





