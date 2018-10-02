import java.util.Scanner;

public class Words {

    public static String[] numbers = { "", "one", "two", "three", "four", "five", "six",
                                       "seven", "eight", "nine", "ten", "eleven", "twelve",
                                       "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen",
                                       "eighteen", "nineteen"};

    public static String[] tens = {  "","ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String inWords(int number){
        if(number == 0){
            return "zero";
        }
        if(number < 20){
            return numbers[number];
        }
        if(number < 100){
            return tens[number/10] + " " + inWords(number % 10);
        }
        if(number < 1000){
            return numbers[number / 100] + " hundred and  " + inWords(number % 100);
        }
        return numbers[number / 1000] + " thousand " + inWords(number % 1000);
    }

   public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
        System.out.print(inWords(n));
   }
}
