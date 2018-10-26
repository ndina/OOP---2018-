package task3;

public class testerfor3 {
    public static void main(String[] args){
        Square s1 = new Square(2, "blue", true);
        Square s2 = new Square(3, "brown", false);
        Reactangle r = new Reactangle(3, 4);

        System.out.println(r.toString());

        System.out.println(s1.toString());

        s2.setColor("red");

       // System.out.println(s2.toString());

        if(s1.equals(s2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
