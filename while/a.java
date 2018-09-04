import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, k = 1, sum = 0;//mini = 30030;
        a = input.nextInt();
        int Sqrtt = k * k;
        while(Sqrtt <= a){
            System.out.printf(Sqrtt + " ");
            k++;
            Sqrtt = k * k;
        }

    }
}