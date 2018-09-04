import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b {
    public static void main(String [] args){
        Scanner input = new Scanner( System.in );
        int a;
        a = input.nextInt();
        if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            System.out.printf("YES");
        }

        else{
            System.out.printf("NO");
        }
    }
}