import java.io.Serializable;
import java.util.*;

public class Manager extends Employee implements Serializable{

    private String newsArticle;
    public static HashMap<Executor,Integer> map=new HashMap<>();
   // public Order order;

    public Manager(String firstName, String lastName, int id, String newsArticle) {
        super(firstName, lastName, id, 500000);
        this.newsArticle = newsArticle;

    }
    public Manager(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public Manager(int id) {
        super(id);
    }

    public String toString() {
        return super.getName() + super.getSurname() + super.getId();
    }
}