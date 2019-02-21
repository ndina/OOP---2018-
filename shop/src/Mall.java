import java.util.Scanner;
import java.util.Vector;

public class Mall {
    String name;
    Store store;
    Customer customer;



    public Mall(){

    }
    public Mall(String a, Store b,Customer c){
        name=a;
        store=b;
        customer=c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCustomers(Customer customers) {
        this.customer = customers;
    }

    public Customer getCustomers() {
        return customer;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Store getStore() {
        return store;
    }

    public void greeting(){
        System.out.println("Please, choose one of these shop.");
        System.out.println("1. Top stuffs");
        System.out.println("2. Baglion");
        System.out.println("3. JLC");
        System.out.print("4. Exit");
    }
    public void enter(){
        System.out.println("Who are you?");
        Scanner cs=new Scanner(System.in);
        int num=cs.nextInt();
        if(num==1){
            System.out.println("Hello Bagdat");
        }
        if(num==2){
            System.out.println("Hello Dina!");
        }
        if(num==3){
            System.out.println("Hello Zholdibay");
        }

    }
    public void exit(Vector<Customer> c){
        for(int i=0; i<c.size(); i++){
            System.out.print(i+1);
            System.out.println(" "+c.get(i));
        }
    }

}