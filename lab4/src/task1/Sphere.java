package task1;

public class Sphere implements Shapes {

    public double radius;

    public Sphere(double r){
        radius = r;

    }

    @Override
    public double volume() {
        return 4/3*Math.PI*radius*radius*radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}
