import java.util.Scanner;

import static java.lang.Math.sqrt;

public class g
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, cnt = 0, a1, a2;
        boolean k = false;
        a = input.nextInt();
        int arr[] = new int[10000];
        for(int i = 0; i < a ; i++){
            arr[i]= input.nextInt();
        }
        for(int i = 0; i < a/ 2; ++i)
        {
            a1 = arr[i];
            a2 = arr[a-1-i];
            arr[i] = a2;
            arr[a - 1- i] = a1;
        }

        for(int i  = 0; i < a; i++){
            System.out.printf(arr[i] + " ");
        }
    }
}
