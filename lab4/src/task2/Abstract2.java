package task2;

public class Abstract2 extends Abstract1 {

    int x, y;

    public Abstract2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getSum(int x, int y){
        return x + y;
    }
}
