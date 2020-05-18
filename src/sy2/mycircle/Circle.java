package sy2.mycircle;

import static java.lang.Math.PI;

public class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double perimeter(){
        return 2*radius*PI;
    }

    public double area(){
        return radius*radius*PI;
    }
}
