import java.util.Observer;
import java.util.Vector;

public class Store {

    public String name;
    public Integer id;
    public Vector<Item> items;
    public Vector<Customer> customers;
    public Vector<Observer> observers;

    public Store(){}
    public void getStore(){
        System.out.println("Choose one of them: ");
        System.out.println("1. Game Store");
        System.out.println("2. Shoe Store");
        System.out.println("3. Book Store");
    }

    public Store(String name, int id){
        this.name = name;
        this.id = id;
        items = new Vector<Item>();
        customers = new Vector<Customer>();
        observers = new Vector<Observer>();
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

//    public void getId(){
//        return id;
//    }



    public void enter(Customer c){
        customers.add(c);
    }

    public void exit(Customer c){
        customers.remove(c);
    }

//    public Enumeration<Customer> customers(){
//        Enumeration e = customers.elements();
//        return e;
//    }

    public void setItems(Vector<Item> items){
        this.items = items;
    }

    public Vector<Item> getItems() {
        return items;
    }

    public void setCustomers(Vector<Customer> customers){
        this.customers = customers;
    }

    public Vector<Customer> getCustomers() {
        return customers;
    }

    public void addObserver(Observer o){
        observers.add(o);
    }



}
