import java.util.Scanner;


public class hypot {
    static boolean xor(int a, int b){
        if((a == 1 && b == 0) || (a == 0 && b == 1))
            return true;
        else
            return false;
    }


    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        a = input.nextInt();
        b = input.nextInt();
        if(xor(a, b)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
