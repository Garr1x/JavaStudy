package zy64;

interface Area{
    public double calsulateArea();
}

class MyCircle implements Area{
    private double radius;

    public MyCircle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calsulateArea() {
        double PI = 3.14;
        return radius*radius* PI;
    }
}

class MyRectangle implements Area{
    private double length;
    private double width;

    public MyRectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calsulateArea() {
        return length*width;
    }
}

public class zy64 {
    public static void main(String[] args){
        MyCircle c = new MyCircle(3);
        MyRectangle rt = new MyRectangle(3.5,4);
        System.out.println("Circle Area:" + c.calsulateArea());
        System.out.println("Retangle Area:"+rt.calsulateArea());
        c.setRadius(5);
        System.out.println("After Modification Circle Area:" + c.calsulateArea());
    }
}
