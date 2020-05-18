package sy2.myclinder;

import sy2.mycircle.Circle;

/**
 * @author Garr1X_Bo
 */
public class Cylinder extends Circle {
    private double h;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double area(){
        return getPerimeter()*h;
    }

    public double volume(){
        return getArea()*h;
    }
}
