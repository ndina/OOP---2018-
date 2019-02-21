import java.io.Console;
import  java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Mall m = new Mall();
        Vector<Customer> customers = new Vector<>();

        Store s1 = new Store();
        Store s2 = new Store();
        Store s3 = new Store();

        Item i1 = new Item(1, "Tufli", 10000);
        Item i2 = new Item(2, "Krossovki", 25000);
        Item i3 = new Item(3, "Botinki", 45000);

        ShoppingCart sh1 = new ShoppingCart();
        ShoppingCart sh2 = new ShoppingCart();
        ShoppingCart sh3 = new ShoppingCart();

        GameStore gs = new GameStore();
        ShoeStore ss = new ShoeStore();
        BookStore bs = new BookStore();

        Customer c1 = new Customer("Bagdat", s1, sh1);
        Customer c2 = new Customer("Dina", s2, sh2);
        Customer c3 = new Customer("Zholdibay", s3, sh3);

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        m.exit(customers);
        m.enter();
        System.out.println();
        m.greeting();

        int res = 0;


        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        while (true) {

            if (a == 1 || a == 2 || a == 3) {
                s1.getStore();
                int num = cs.nextInt();
                boolean ok = true;

                if (num == 2) {
                        System.out.println("Choose one of them: ");
                        ss.items();
                        String str = cs.nextLine();

                            int gnum = cs.nextInt();

                            if (gnum == 1) {

//                                sh1.items.add(str);
                                sh1.sumof(i1.price);
                                System.out.println(sh1.getPrice());//;sh1.getPrice()
                              //  System.out.println("Your price is: " + res );

                            }
                            if (gnum == 2) {
                                sh1.items.add(str);
                                sh1.sumof(i2.price);
                               // System.out.println("Your total price is: " + sh1.getPrice());

                            }
                            if (gnum == 3) {
                                sh1.items.add(str);
                                sh1.sumof(i3.price);
                              //  System.out.println("Your total price is: " + sh1.getPrice());
                            }



                }
                if (num == 2) {
                    bs.items();
                    System.out.println("Choose one of them: ");
                    ss.items();
                    String str = cs.nextLine();

                    int gnum = cs.nextInt();

                    if (gnum == 1) {

//                                sh1.items.add(str);
                        sh1.sumof(i1.price);
                        System.out.println(sh1.getPrice());//;sh1.getPrice()
                        //  System.out.println("Your price is: " + res );

                    }
                    if (gnum == 2) {
                        sh1.items.add(str);
                        sh1.sumof(i2.price);
                        // System.out.println("Your total price is: " + sh1.getPrice());

                    }
                    if (gnum == 3) {
                        sh1.items.add(str);
                        sh1.sumof(i3.price);
                        //  System.out.println("Your total price is: " + sh1.getPrice());
                    }




                }
                if (num == 3) {
                    ss.items();
                    System.out.println("Choose one of them: ");
                    ss.items();
                    String str = cs.nextLine();

                    int gnum = cs.nextInt();

                    if (gnum == 1) {

//                                sh1.items.add(str);
                        sh1.sumof(i1.price);
                        System.out.println(sh1.getPrice());//;sh1.getPrice()
                        //  System.out.println("Your price is: " + res );

                    }
                    if (gnum == 2) {
                        sh1.items.add(str);
                        sh1.sumof(i2.price);
                        // System.out.println("Your total price is: " + sh1.getPrice());

                    }
                    if (gnum == 3) {
                        sh1.items.add(str);
                        sh1.sumof(i3.price);
                        //  System.out.println("Your total price is: " + sh1.getPrice());
                    }



                }

                if(num == 4){
                    System.out.println("Your total price is: " + sh1.getPrice());
                    break;

                }

                if (a == 4) {
                  break;
                }
            }

        }
    }
}
