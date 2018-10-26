package task3;

public class Circle extends Shape {

    double radius;


    Circle(){};

    public Circle(double radius){
        radius = radius;
    }
    public Circle(String color, boolean filled ){
        color = color;
        filled = filled;
    }

    public Circle(double radius, String color, boolean filled ){
        radius = radius;
        color = color;
        filled = filled;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double radius){
        radius = radius;

    }


    @Override
    public double getPerimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    public String toString(){
        return super.toString() + "Area of the Circle is " + getArea();

    }
}
