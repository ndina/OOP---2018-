package task3;

public class Reactangle extends Shape {

    double width;
    double lenght;

    public Reactangle(){}


    public Reactangle(double width, double length){
        width = width;
        length = lenght;
    }

    public Reactangle(double width, double lenght, String color, boolean filled){
        width = width;
        lenght = lenght;
        color = color;
        filled = filled;
    }
    double getWidth(){
        return width;
    }
    void setWidth(double width){
        width = width;
    }

    double getLenght(){
        return lenght;
    }

    void setLenght(double length){
        length = lenght;
    }


    @Override
    public double getPerimeter() {

        return 2*(width + lenght);
    }

    @Override
    public double getArea() {

        return width * lenght;
    }

    public String toString(){
        return super.toString() + " Perimeter of the rectangle is " + getPerimeter();
    }
}
