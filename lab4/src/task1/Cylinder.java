package task1;

public class Cylinder implements Shapes {
    public double r;
    public double h;

    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public double volume(){
        return Math.PI*r*r*h;
    }

    public double surfaceArea(){
        return 2 * Math.PI*r*(r + h);
    }
}
