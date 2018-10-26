package bonus;

public class Board {
    public static String[][] pieces = new String[8][8];
    public static String[][] colors = new String[8][8];

    public Board() {

    }

    public static void print() {
        System.out.println(" a  b  c  d  e  f  g  h");
        for(int i=0; i<8; i++) {
            System.out.println("- - - - - - - - - - -");

            for(int j=0; j<8; j++) {
                if(pieces[i][j]!=null)
                    System.out.println("|"+pieces[i][j]);
                else System.out.println("| ");
            }

            System.out.println("|");
            System.out.println();
        }

        System.out.println("- - - - - - - - - - -");
        System.out.println(" a  b  c  d  e  f  g  h");
    }
}