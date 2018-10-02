import javax.lang.model.element.AnnotationMirror;

public class Animal {
    private String color;

    public Animal(){
        color = "brown";
    }
    public Animal(String initialColor){
        this.color = initialColor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String toString(){
        return "The color of this animal is " + color;
    }
}
class Dog extends Animal {
    private int year;

    public Dog() {
        super();
        year = 2;
    }

    public Dog(String initialColor, int year) {
        super(initialColor);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String toString() {
        return super.toString() + " and his age is " + year;
    }
}




