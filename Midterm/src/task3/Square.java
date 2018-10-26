package task3;

public class Square extends Reactangle {
    //double side;
    Square(){}
    public Square(double width, String color, boolean filled){
        width = width;
        color = color;
        filled = filled;

    }

    double getSide(){
        return width;
    }

    void setSide(double side){
        width  = side;
    }

    @Override
    double getLenght() {
        return super.getLenght();
    }

    @Override
    double getWidth() {
        return super.getWidth();
    }

    public boolean equals(Object obj){
        Square s = (Square)obj;
        if(this.color == s.color){
            if(super.equals(obj)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return super.toString() + "side of the square is  " + getLenght();
    }
}
