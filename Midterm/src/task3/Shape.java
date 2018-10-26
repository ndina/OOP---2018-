package task3;

public abstract  class Shape {
    String color;
    boolean filled;

    public Shape(){}

    Shape(String color, boolean filled){
    }
    String getColor(String s){
        return s;
    }

    public void setColor(java.lang.String color) {
        this.color = color;
    }

    boolean isFilled(){
        if(color != null){
            return true;
        }
        return false;
    }
    void setFilled(boolean filled){
        filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
        return "Color is " + color;
    }
}
