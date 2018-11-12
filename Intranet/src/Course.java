import java.io.Serializable;
import java.util.*;

public class Course implements Serializable {
    private String courseTitle;
    private Vector<Teacher> teach;
    public Vector<CourseFile> file;
    private int credit;
    private TreeMap<Student, Mark> marks;
    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;
        int cnt = 1;
        hash = (prime * hash + cnt);
        cnt++;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Course other = (Course) obj;
        if(courseTitle == null){
            return other.courseTitle == null;
        }
        else return this.courseTitle.equals(other.courseTitle);
    }

    public Course(String courseTitle, int credit){
        this.courseTitle = courseTitle;
        this.credit = credit;
        file = new Vector<CourseFile>();
        marks = new TreeMap<Student, Mark>();
    }

    public Course(String courseTitle){
        this.courseTitle = courseTitle;
    }

    public String getCourseTitle(){
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }

    public String toString(){
        return "Course" + courseTitle;
    }

    public int getCredit(){
        return credit;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public String watchFile(Vector<CourseFile> file){
        return "Course files: "+file.toString();
    }
    public String watchTeacher(Vector<Teacher> teach) {
        return "There are "+teach.size()+" teachers on this course:"+teach.toString();
    }
}
