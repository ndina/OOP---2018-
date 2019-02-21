public class GameStore extends Store {
    public GameStore(){}
    public GameStore(String name, int id){
        super(name, id);
    }

    Item i1 = new Item(1, "GTA", 10000);
    Item i2 = new Item(2, "Mortal Combat", 25000);
    Item i3 = new Item(3, "Counter Strike", 45000);
    public void items(){
        System.out.println("1. GTA   45000 tg");
        System.out.println("2. Mortal Combat 40000 tg");
        System.out.println("3. Counter-Strike 35000 tg");
    }
}
