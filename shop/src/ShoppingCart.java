import java.util.Vector;

public class ShoppingCart extends Item {
    public Vector<String> items;

    int res = 0;

    public void sumof(int pr){
        res+=pr;
    }


//    public void setItems(Vector<String> items){
//        this.items = items;
//    }
//
//    public Vector<Item> getItems(){
//        return items;
//    }

    public void addItem(String i ){
        items.add(i);
    }
    public void removeItem(String i){
        items.remove(i);
    }
    public String items(){
        String myitem = "";
        for(int i = 0; i < items.size(); i++){
            myitem += items.get(i);
        }
        return myitem;
    }

    public int getPrice(){
        return res;
    }
}
