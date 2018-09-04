
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        for(int i = a; i <= b; i++){
            if(i % d == c){
                System.out.print(i + " ");
            }
        }

    }
}
