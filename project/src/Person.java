import java.util.*;
import java.io.*;

public abstract class Person implements Comparable, Serializable, Cloneable{

    private String firstName;
    private String  lastName;
    private int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public Person(int id) {
        this.id = id;
    }
    public Person() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return firstName;
    }
    public void setName(String firstName) {
        this.firstName = firstName;
    }
    public String  getLastName() {
        return lastName;
    }
    public void setLastName(String  lastName) {
        this.lastName = lastName;
    }

	/*public int compareTo(Object o) {
		Person aa = (Person) o;
		return this.compareTo(aa);
	}*/

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
