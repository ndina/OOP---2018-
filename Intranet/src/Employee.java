import java.util.*;
public class Employee extends Person {

    private int salary;
    private Date hireDate;

    public Employee(String name, String surname, int id) {
        super(name, surname, id);
    }
    public Employee(String name, String surname, int id, int salary) {
        super(name, surname, id);
        this.salary = salary;
    }
    public Employee(int id){
        super(id);
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary = s;
    }
    public Date getHireDate(){
        return hireDate;
    }
    public void setHireDate(Date d){
        this.hireDate = d;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        return Integer.compare(this.salary, e.salary);
    }
}
