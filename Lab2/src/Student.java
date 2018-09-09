public class Student{
    public static String name;
    public static int id;
    public static int year_of_study;

    public Student(String name, int year_of_study){
     this.name = name;
     this.year_of_study = year_of_study;
    }

    static String getName(){
        return name;
    }
    static int getId(){
        return id;
    }
    static int getYear(int y){
        return y;
    }

    public static void main(String[] args) {
        Student s = new Student("Dina", 2018);
        getId();

    }



}