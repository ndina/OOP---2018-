import java.util.Scanner;

import static java.lang.Math.sqrt;

public class c {
    public static void main(String [] args){
        Scanner input = new Scanner( System.in );
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int res = b / a;

        System.out.printf("%d", res);
    }
}