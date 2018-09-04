import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hypot {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, mini = 10000;
        boolean k = false;
        a = input.nextInt();
        int  i = 1;
        while(i <= a){

            if(i == a) {
                k =true;
                // System.out.printf("YES");
            }
            i *= 2;
        }
        if(k){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}