public class BookStore extends Store {
    public BookStore(String name, int id){
        super(name, id);
    }

    Item i1 = new Item(1, "Abai zholy", 10000);
    Item i2 = new Item(2, "Velikii Gatsby", 25000);
    Item i3 = new Item(3, "Belyu parohod", 45000);
    public BookStore(){}
    public void items(){
        System.out.println("1 Абай жолы 5100 tg");
        System.out.println("2 Великий Гетсби 990 tg");
        System.out.println("3 Белый пароход 1230 tg");
    }
}
