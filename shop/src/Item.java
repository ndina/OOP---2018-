public class Item extends Store {

    public String name;
    public int id;
    public int scoreId;
    public int price;

    public Item(){}

    public Item(int id, String name, int price){
        id= id;
        name = name;
        price = price;
    }

    public Item(String name, int id, int scoreId, int price){
        this.name = name;
        this.id = id;
        this.scoreId = scoreId;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScoreId(int scoreId){
        this.scoreId = scoreId;
    }
    public int getScoreId(){
        return scoreId;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return name + " " + price;
    }


}
