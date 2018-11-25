import java.io.Serializable;
import java.util.*;

public class Manager extends Employee implements Serializable{

    private String newsArticle;
    public static HashMap<Executor,Integer> map=new HashMap<>();
    static public News news;
    public Room room;
    public Order order;
    AccessLevel acc;

    public Manager(String firstName, String lastName, int id, String news) {
        super(firstName, lastName, id, 500000);
        this.newsArticle = news;

    }
    public Manager(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }
    public Manager(int id) {
        super(id);
    }

    public static void addCourse(Course c) {
        Storage.courses.addElement(c);
    }



    public static void addExecutorSalary(Executor ex) {
        map.put(ex, ex.getSalary()+ex.bonus);
    }
    public static void addNews(String s) {
        Storage.newsVec.addElement(s);
    }

    public void addRoom(Room r) {
        room.roomVec.addElement(r);
    }

    public String toString() {
        return super.getName() + super.getSurname() + super.getId();
    }
}