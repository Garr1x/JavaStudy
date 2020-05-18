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

    @Override
    public double area(){
        return Perimeter()*h;
    }

    public double volume(){
        return super.area()*h;
    }
}
