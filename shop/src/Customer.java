import java.util.Vector;

public class Customer {
    String name;
    Store store;
    ShoppingCart ShoppingCart;
    Vector<Store> s;

    public Customer(String a, Store b, ShoppingCart c){
        name=a;
        s=new Vector<>();
        store=b;
        ShoppingCart=c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Store getStore() {
        return store;
    }


    public void setShoppingCart(ShoppingCart shoppingCart) {
        ShoppingCart = shoppingCart;
    }

    public ShoppingCart getShoppingCart() {
        return ShoppingCart;
    }

    @Override
    public String toString() {
        return "Customer  "+name;
    }
}