import java.io.Serializable;

public abstract class Person implements Comparable, Serializable, Cloneable {

    private String name;
    private String surname;
    private int id;

    public Person(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public Person(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String s){
        this.name = s;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String s){
        this.surname = s;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String toString(){
        return name + " " + surname + " " + id;
    }

    @Override
    public int hashCode() {
        final int p = 31;
        int hash = 1;
        hash = p * hash + id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Person p = (Person) obj;
        return id == p.id;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.compareTo(p);
    }

}