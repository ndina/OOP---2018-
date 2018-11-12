package task4;

public class Plane implements Flyable {

    double x, y, path;
    public double path1, path2;

    public Plane(double x, double y){
        this.x = x;
        this.y = y;
    }


    @Override
    public void fly(int x, int y) {
        path1 = Math.sqrt(x*x + y*y);
    }

    @Override
    public void move(double path) {
       this.path = path;
    }

    public String toString(){
        return "The path of the Plane is equal to " + path1 + " \n The starting height is equal to " + path;
    }
}
