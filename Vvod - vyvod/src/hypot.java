import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args){
        Scanner input = new Scanner( System.in );
        double a, b;
        a = input.nextInt();
        b = input.nextInt();
        double c = sqrt((a * a) + (b*b));

        System.out.printf("%f", c);
    }
}