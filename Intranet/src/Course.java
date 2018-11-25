import java.io.Serializable;
import java.util.*;
public class Course implements Serializable{

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((courseTitle == null) ? 0 : courseTitle.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (courseTitle == null) {
            if (other.courseTitle != null)
                return false;
        } else if (!courseTitle.equals(other.courseTitle))
            return false;
        return true;
    }
    private String courseTitle;
    private Vector<Teacher> teach;
    //private CourseFile file;
    public Vector<CourseFile> file;

    private int credit;
    private TreeMap<Student, Mark> marks;

    public Course(String courseTitle, int credit) {
        this.courseTitle = courseTitle;
        this.credit = credit;
        file= new Vector<CourseFile>();
        marks = new TreeMap<Student, Mark>();
    }

    public Course(String course) {
        courseTitle=course;
    }
    public Course() {

    }

    public String toString() {
        return "Course:" + courseTitle;
    }


    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String watchFile(Vector<CourseFile> file){
        return "Course files: "+file.toString();
    }
    public String watchTeacher(Vector<Teacher> teach) {
        return "There are "+teach.size()+" teachers on this course:"+teach.toString();
    }
}