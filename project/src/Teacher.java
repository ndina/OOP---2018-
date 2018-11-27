import java.io.*;
import java.util.*;

public class Teacher extends Employee implements Serializable{

    private Depart department;
    private String email;
    private int score;
    private TeachTitle degree;
    AccessLevel acc;
    public LinkedHashMap<Course, Vector<Student>> students;
    public LinkedHashMap <Course, Vector <CourseFile> > file;

//public static LinkedHashMap<Teacher, Storage.> regedTeach = new LinkedHashMap<Teacher, regedStu>();

    public	Teacher() {
        students = new LinkedHashMap <Course, Vector <Student> >();
        file = new LinkedHashMap <Course, Vector <CourseFile> >();
    }
    public Teacher(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
        students = new LinkedHashMap <Course, Vector <Student> >();
        file = new LinkedHashMap <Course, Vector <CourseFile>>();
    }

    public Teacher(String firstName, String lastName, int id, String email) {
        super(firstName, lastName, id, 700000);
        this.email = email;
        students = new LinkedHashMap <Course, Vector <Student> >();
        file = new LinkedHashMap <Course, Vector <CourseFile>>();
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
    public Depart getDepartment() {
        return department;
    }

    public void setDepartment(Depart department) {
        this.department=department;
    }
    public String getCourses(){
        String s = "";
        int cnt = 1;
        for(Course value:students.keySet()) {
            s += cnt +" "+value;
            cnt++;
        }

        return s;
    }
    public Vector<Student> getStudents(String s) {
        Course c = new Course(s);


        return students.get(c);
    }

    public boolean equals(Object other) {
        Teacher otherTeacher =(Teacher)other;
        return super.equals(other)&& this.score==otherTeacher.score && this.degree.equals(degree) &&this.department.equals(department)&& this.email==otherTeacher.email;

    }

    public int compareTo(Object o) {
        Teacher em=(Teacher)o;
        if(score>em.score) return 1;
        if(score<em.score) return -1;
        return 0;
    }

    public LinkedHashMap<Course, Vector<Student>> getGrade() {
        return null;
    }
    public void setGrade(int id, Course c, int m) {
        Student s = new Student(id);
        //Course c = new Course(course);
        int index = students.get(c).indexOf(s); // get vector of courses and index of student
        students.get(c).get(index).disciplines.put(c,m); // get student and put mark on special courses
        Storage.marks.put(s, m);
    }


    public void addCourseFile(String s, Course c) {
        Vector m = new Vector<CourseFile>();
        m.add(new CourseFile(s));
        file.put(c,m);
    }

}