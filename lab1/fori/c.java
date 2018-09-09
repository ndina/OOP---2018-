import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double c;
        a = input.nextInt();
        b = input.nextInt();

        for(int i = a; i <= b; i++){
            c = sqrt((double)i);
            if(c * c == i){
                System.out.print(i + " ");
            }
        }

    }
}
