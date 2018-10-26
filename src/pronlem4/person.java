package pronlem4;


public class person {
    String name;

    public person() {
        this.name = "unknown";
    }

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Person Name: " + this.name);
        return this.name;
    }
}