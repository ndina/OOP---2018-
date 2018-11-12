import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class Student extends Person implements Comparable, Serializable {

    private double gpa;
    public LinkedHashMap<Course, Integer> disciplines;


    public Student(String name, String surname, int id) {
        super(name, surname, id);
    }
    public Student(String name, String surname, int id, double gpa) {
        super(name, surname, id);
        this.gpa = gpa;
        disciplines = new LinkedHashMap<Course, Integer>();
    }
    public Student(int id) {
        super(id);
        disciplines = new LinkedHashMap<Course, Integer>();
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa=gpa;
    }
    public String getDesciplines(){
        String s = "";
        for(Entry<Course, Integer> entry : disciplines.entrySet()){
            s+= entry.getKey() + " " + entry.getValue();
        }
        return s;
    }

  //  public void setDiscipline(){}


    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return Double.compare(this.gpa, s.gpa);
    }
}
