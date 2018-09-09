import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a;//mini = 30030;
        a = input.nextInt();
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                System.out.printf(i + " ");
            }
        }
        //  System.out.printf("%d", mini);
    }
}