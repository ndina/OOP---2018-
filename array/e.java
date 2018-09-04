import java.util.Scanner;

import static java.lang.Math.sqrt;

public class e {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, cnt = 0;
        boolean k = false;
        a = input.nextInt();
        int arr[] = new int[10000];
        for(int i = 0; i <a; i++){
            arr[i]= input.nextInt();
            if(arr[i] * arr[i+1] > 0){
                k = true;
            }
        }
        if(k){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}