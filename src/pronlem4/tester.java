package pronlem4;

public class tester {

    public static void printInformation(person p) {
        p.getName();
    }

    public static void main(String args[]) {
        Student st = new Student("Gani");
        Employee emp = new Employee("Kasym");

        person ref;

        ref = st;
        ref.getName();

        ref = emp;
        ref.getName();

        printInformation(st);
        printInformation(emp);
    }
}