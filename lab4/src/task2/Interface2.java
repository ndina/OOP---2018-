package task2;

public class Interface2 implements Interface1 {

    int x = 0;

    public Interface2(int x){
        this.x = x;
    }

    public void sum(int n){
        x += n;
    }
}
