import java.util.*;

public class Executor extends Employee{
    int bonus;
    AccessLevel acc;
    //public Vector<Order> vecO;
    Order r;

    public Executor(String firstName, String lastName, int id) {
        super(firstName, lastName, id, 100000);
        this.bonus=0;
    }
    public Executor() {
    }
    public Executor(int id) {
        super(id);
    }

    public void choose(Order pr) {
        Storage.orders.remove(pr);
        bonus+=10;
        super.salary+=bonus;

    }
    public String toString() {
        return super.toString()+" "+bonus+super.getSalary();

    }
    public int compareTo(Object o) {
        Executor e = (Executor) o;
        if (super.compareTo(o)==0) {
            if(bonus <e.bonus) return -1;
            if(bonus > e.bonus) return 1;
            return 0;
        }
        return super.compareTo(o);
    }
}