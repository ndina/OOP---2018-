import java.util.Scanner;

import static java.lang.Math.sqrt;

public class c {
    public static void main(String [] args){
        Scanner input = new Scanner( System.in );
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        if((a == 1 && b == 1) || ( a!=1 && b != 1)){
            System.out.printf("YES");
        }

        else{
            System.out.printf("NO");
        }
    }
}
