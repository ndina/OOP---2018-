import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;


public class Student extends Person implements Comparable, Serializable{

    private double gpa;
    private Depart faculty;
    public Map<Course, Integer> disciplines;
    AccessLevel acc;

    public Student(String firstName, String lastName, int id, double gpa) {
        super(firstName, lastName, id);
        this.gpa = gpa;
        disciplines = new LinkedHashMap<Course, Integer>();
    }
    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
        disciplines = new LinkedHashMap<Course, Integer>();
    }
    public Student(int id) {
        super(id);
        disciplines = new LinkedHashMap<Course, Integer>();
    }
    public Student() {
        disciplines = new LinkedHashMap<Course, Integer>();
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa=gpa;
    }

    public String getDesciplines() {
        String s="";
        for(Entry<Course, Integer> entry : disciplines.entrySet()) {
            s+=entry.getKey()+" "+entry.getValue();
        }
        return s;
    }

    public void setDesciplines(Course e, Register r) {
        if(disciplines.size() < 11 && r.openReg() == true)
            disciplines.put(e, 0);

        else System.out.println("Enought descipline");

    }
    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        if(gpa<s.gpa) return -1;
        if(gpa>s.gpa) return 1;
        return 0;
    }
}