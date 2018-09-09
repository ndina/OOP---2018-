import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, sum = 0;//mini = 30030;

        for(int i = 1; i <= 100; i++){
            a = input.nextInt();
            sum += a;
        }
        System.out.printf("%d", sum);
    }
}