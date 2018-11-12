package task1;

public class Cube implements Shapes {
    public double edge;

    public Cube(double e){
        this.edge = e;
    }


    @Override
    public double volume() {
        return edge*edge*edge;
    }

    @Override
    public double surfaceArea() {
        return 6 * edge*edge;
    }
}
