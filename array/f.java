import java.util.Scanner;

import static java.lang.Math.sqrt;

public class f {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, cnt = 0;
        boolean k = false;
        a = input.nextInt();
        int arr[] = new int[10000];
        for(int i = 1; i <a - 1; i++){
            arr[i]= input.nextInt();
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1] ){
                cnt++;
            }
        }
        System.out.printf("%d", cnt);
    }
}