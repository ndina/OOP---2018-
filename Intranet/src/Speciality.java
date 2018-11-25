import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class Speciality {

    private String specialName;
    public Vector<String> spec = new Vector<String>();

    public Speciality() {
        spec.add("Information Systems");
        spec.add("Computer Systems and Software");
        spec.add("Automation and Control");
        spec.add("Finance");
        spec.add("Managment");
        spec.add("Mathematical and Computer Modelling");
        spec.add("Economics");
        spec.add("Petroleum Engineering");
        spec.add("Accounting and Auditing");
        spec.add("Marine Engineering and Technology");
    }

    public String toString(){
        return "There are "+spec.size()+" specialities: "+spec.toString();
    }


    public void serialize(Vector<Speciality> s) {
        try {
            FileOutputStream f = new FileOutputStream("speciality.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(s);
            o.flush();
            o.close();
            f.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}