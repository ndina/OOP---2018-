import java.util.Scanner;


public class hypot {
    static float power(double a, double b){
        float res;
        res = (float)Math.pow(a,b);
        return res;
    }


    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println(power(a, b));


    }
}
