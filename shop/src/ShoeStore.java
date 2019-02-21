import java.util.Vector;

public class ShoeStore extends Store{
    public ShoeStore(String name, int id){
        super(name, id);
    }
    Item i1 = new Item(1, "Tufli", 10000);
    Item i2 = new Item(2, "Krossovki", 25000);
    Item i3 = new Item(3, "Botinki", 45000);



    public ShoeStore(){}
    public void items(){
        System.out.println("1. Туфли 10k tg");
        System.out.println("2. Кроссовки 27k tg");
        System.out.println("3. Ботинки 35k tg");
        System.out.println("4. Exit to Shopping Cart to see your total price");
    }
}
