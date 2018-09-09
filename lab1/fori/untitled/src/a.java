
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class a {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double c;
        a = input.nextInt();
        b = input.nextInt();

        for(double i = sqrt(a); i * i <= b; i++){
            /*c = sqrt((double)i);
            if(c * c == i){
                System.out.print(i + " ");
            }
            */
            System.out.print(i * i + " " );
        }

    }
}