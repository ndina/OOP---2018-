import java.io.Serializable;
import java.util.*;

public class Teacher extends Employee implements Serializable {

    private String email;
    private int score;
    public LinkedHashMap<Course, Vector<Student>> students;
    public LinkedHashMap<Course, Vector<CourseFile>> file;


    public Teacher(String name, String surname, int id) {
        super(name, surname, id);
        students = new LinkedHashMap<Course, Vector<Student>>();
        file = new LinkedHashMap<Course, Vector<CourseFile>>();
    }

    public Teacher(String name, String surname, int id, String email) {
        super(name, surname, id);
        this.email = email;
        students = new LinkedHashMap<Course, Vector<Student>>();
        file = new LinkedHashMap<Course, Vector<CourseFile>>();
    }
    public Teacher(int id) {
        super(id);
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getCourses(){
        String s = "";
        for(Course value: students.keySet()){
            s += value;
        }
        return s;
    }

    public Vector<Student> getStudents(String s){
        Course c = new Course(s);
        return students.get(c);
    }


    public int compareTo(Object o) {
        Teacher t=(Teacher)o;
        return Integer.compare(score, t.score);
    }

    public LinkedHashMap<Course, Vector<Student>> getGrade(){
        return null;
    }
    public void setGrade(int id, Course c, int marks) {
        Student s = new Student(id);
        int ind = students.get(c).indexOf(s); // достает вектор курсов и индекс студента
        students.get(c).get(ind).disciplines.put(c, marks); // достает студента и ставит балл по определенным дисциплинам

    }

    public void addCourseFile(String s, Course c){
        Vector v = new Vector<CourseFile>();
        v.add(new CourseFile(s));
        file.put(c, v);
    }
}


