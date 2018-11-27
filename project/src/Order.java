import java.io.Serializable;
import java.util.*;

public class Order implements Serializable{

    private String problem;
    //private Room room;
    private int room;
    //public TreeMap<String, Room> pr = new TreeMap<String, Room>();
    public static Vector<Order> orders;

    /*public Order(String problem, Room room) {
    	this.problem = problem;
    	this.room = room;
    }*/
    public Order() {
    }
    public Order(String problem) {
        this.problem = problem;
    }
    public Order(String problem, int room) {
        this.problem = problem;
        this.room = room;
    }
    public String getProblem() {
        return problem;
    }
    public void setProblem(String problem) {
        this.problem = problem;
    }
    @Override
    public String toString() {
        return "Order" + problem+" room:"+room;
    }
}