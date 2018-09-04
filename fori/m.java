import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, sum = 0;//mini = 30030;
        a = input.nextInt();
        for(int i = 1; i <=a; i++){
            b = input.nextInt();
            if(b == 0)
                sum ++;
        }
        System.out.printf("%d", sum);
    }
}
