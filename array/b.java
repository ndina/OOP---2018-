import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        for(int i = 0; i < a; i++){
            b = input.nextInt();
            if(b % 2 == 0){
                System.out.printf(b + " ");
            }
        }
    }
}