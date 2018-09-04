
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class c {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, cnt = 0;
        a = input.nextInt();
        for(int i = 0; i < a; i++){
            b = input.nextInt();
            if(b > 0){
                cnt++;
            }
        }
        System.out.printf("%d" , cnt);
    }
}
