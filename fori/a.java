import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        for(int i = a; i <= b; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

    }
}