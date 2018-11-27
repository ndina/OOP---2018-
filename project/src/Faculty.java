import java.util.*;
public class Faculty {

    private ArrayList<Speciality> specialities = new ArrayList<Speciality>();
    private ArrayList<Course> program = new ArrayList<Course>();
    private String faculName;
    private Depart dep;


    public Faculty(String faculName) {
        this.faculName = faculName;
    }
    public String getFaculty() {
        return faculName;
    }
    public void setFaculty(String faculName) {
        this.faculName = faculName;
    }

/*public String knowSpec(String faculName) {

}*/
}
