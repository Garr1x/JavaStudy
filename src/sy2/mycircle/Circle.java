package sy2.mycircle;

import static java.lang.Math.PI;

/**
 * @author Garr1X_Bo
 */
public class Circle {
    private double radius;
    private double centerX;
    private double centerY;
    private double area;
    private double perimeter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
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

    public void calculatePerimeter(){
        perimeter = 2*radius*PI;
    }

    public void calculateArea(){
        area = radius*radius*PI;
    }
}
