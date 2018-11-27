import java.util.*;

public class Employee extends Person {
    Order order;

    public int salary;
    private Date hireDate;

    public Employee(String firstName, String lastName, int id, int salary) {
        super(firstName, lastName, id);
        this.salary = salary;
    }
    public Employee(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }
    public Employee(int id) {
        super(id);
    }
    public Employee() {
        super();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
	/*public void addOrder(Order r, String problem, Employee Employee ) {
		if(Employee instanceof Teacher ||  Employee instanceof Admin || Employee instanceof Manager) {
			r.setProblem(problem);
		}
	}*/

    public void addOrder(String s, int room, Employee e) {
        if(!(e instanceof Executor))
            Order.orders.addElement(new Order(s,room));
    }
    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        if(salary<e.salary) return -1;
        if(salary> e.salary) return 1;
        return 0;
    }

}