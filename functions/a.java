import java.util.Scanner;

import static java.lang.Math.sqrt;


public class hypot {
    public static void Min(int a, int b, int c, int d){
        int res = Math.min( Math.min(a, b), Math.min(c,d));
        System.out.printf("%d", res);
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        hypot.Min(a, b, c, d);


    }
}
