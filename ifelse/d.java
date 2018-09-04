import java.util.Scanner;

import static java.lang.Math.sqrt;

public class d {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        if(a > 0){
            System.out.printf("1");
        }
        else if(a < 0){
            System.out.printf("-1");
        }
        else{
            System.out.printf("0");
        }
    }
}
