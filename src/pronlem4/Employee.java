package pronlem4;

public class Employee extends person {
    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public String getName() {
        System.out.println("Employee Name: " + super.name);
        return super.name;
    }
}
