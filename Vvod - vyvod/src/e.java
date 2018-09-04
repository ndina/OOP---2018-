import java.util.Scanner;

import static java.lang.Math.sqrt;

public class e {
    public static void main(String [] args){
        Scanner input = new Scanner( System.in );
        int a, b, res;
        a = input.nextInt();
        b = input.nextInt();
        if(a < 0){
            res = (109 + ((a * b) % 109)) % 109 ;
            // System.out.printf()
        }
        else{
            res = (a * b) % 109;
        }

        System.out.printf("%d", res);
    }
}