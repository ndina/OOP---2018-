import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, mini = 10000;
        a = input.nextInt();
        int  i = 2;
        while(i <= a){
            if(a % i == 0){
                if(i < mini){
                    mini = i;
                }
            }
            i++;
        }
        System.out.printf("%d", mini);
    }
}
