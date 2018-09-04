import java.util.Scanner;

import static java.lang.Math.sqrt;

public class e {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        if(a > b){
            System.out.printf("1");
        }
        else if(a < b){
            System.out.printf("2");
        }
        else{
            System.out.printf("0");
        }

    }
}
