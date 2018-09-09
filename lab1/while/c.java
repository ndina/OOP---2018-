import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, mini = 10000;
        a = input.nextInt();
        int  i = 1;
        while(i <= a){
            System.out.printf(i + " ");
            i *= 2;
        }
    }
}
