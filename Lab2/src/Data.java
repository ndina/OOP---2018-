import java.util.Scanner;

public class Data {

    private double sum = 0;
    public int cnt = 0;
    private double maxi = -100;

    Data(){

    }

    public void addtoData(int a){
        if(maxi < a){
            maxi = a;
        }
        sum+= a;
        cnt++;

    }

    public String res(){
        return "Average =  " + sum/cnt + "\n" + "Maximum = " + maxi;
    }

    public static void main(String[] args){
        System.out.print("Enter number(Q to quit(Q): ");
        Scanner input = new Scanner(System.in);
        Data data = new Data();
        int n;
        String s = input.next();

        while(!s.equals("Q")){
            System.out.print("Enter number(Q to quit(Q): ");
            n = Integer.parseInt(s);
            data.addtoData(n);
            s = input.next();
        }

        if(s.equals("Q")){
            System.out.println(data.res());
        }

    }

}
