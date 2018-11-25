
import java.util.*;

public class Admin extends Employee{

    Storage store = new Storage();

    public Admin(String firstName, String lastName, int id) {
        super(firstName, lastName, id, 200000);
    }
    public Admin() {
    }

    public void addToSystem(String firstName, String lastName,int id, int choice) {

        if (choice == 3) {
            Student s = new Student(firstName, lastName,id);
            store.mapS.put(id, s);
        }

        else if (choice == 2) {
            Teacher t = new Teacher(firstName, lastName, id);
            store.mapT.put(id, t);
        }

        else if (choice ==  1) {
            Manager m = new Manager(firstName, lastName, id);
            store.mapM.put(id, m);
        }

        else if (choice == 4) {
            Executor ex = new Executor(firstName, lastName, id);
            store.mapE.put(id, ex);
        }
        else
            System.out.println("Cannot add");
    }


    public void removeFromSystem(int id, int choice) {

        if (choice == 3) {	// student
            Student s = new Student(id);
            store.mapS.remove(s);
        }

        else if (choice == 2) { // teacher
            Teacher t = new Teacher(id);
            store.mapT.remove(t);
        }

        else if (choice ==  1) { // manager
            Manager m = new Manager(id);
            store.mapM.remove(m);
        }

        else if (choice == 4) { // executor
            Executor e = new Executor(id);
            store.mapE.remove(e);
        }
        else
            System.out.println("Cannot add");

    }

    /*public String toString() {
    	String s = "";
    	int cnt = 1;
		Iterator it = store.vecM.iterator();
	    while (it.hasNext()) {
	      System.out.println(cnt+ ")"+it.next());
	      s += cnt +" "+it.next();
	      cnt++;
	    }
	    return s;
    }*/
}

