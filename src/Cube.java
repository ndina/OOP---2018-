class Cube extends Shapes{
    public double side;

    public Cube(double side){
        this.side = side;
    }

    public double volume(){
        return side*side*side;
    }
    public double surfaceArea(){
        return 6*side*side;
    }

}
