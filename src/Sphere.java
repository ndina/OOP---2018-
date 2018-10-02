class Sphere extends Shapes {

    public double r;

    public Sphere(double r){
        this.r = r;
    }
    public double volume(){
        return 4/3 * r * r * r * Math.PI;
    }
    public double surfaceArea(){
        return 4*Math.PI*r*r;
    }

}
