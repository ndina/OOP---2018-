import java.util.Scanner;

import static java.lang.Math.sqrt;

public class a {
    public static void main(String [] args){
        Scanner input = new Scanner( System.in );
        int a, b, res;
        a = input.nextInt();
        b = input.nextInt();
        if(a > b){
            res = a;
        }
        else{
            res = b;
        }
        System.out.printf("%d", res);
    }
}