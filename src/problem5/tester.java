package problem5;

import javafx.geometry.Pos;

public class tester{
    public static void main(String args[]) {
        Position a = new Position(2, 4);
        Position b = new Position(2, 2);


        Knight knight = new Knight(a);;
        Bishop bishop = new Bishop(a);
        Queen queen = new Queen(a);

        System.out.println("Knight can move from A to B is: \t" + knight.isLegalMove(knight.getPosition(), b));
        System.out.println("Bishop can move from A to B is: \t" + bishop.isLegalMove(bishop.getPosition(), b));
        System.out.println("Queen can move from A to B is:  \t" + queen.isLegalMove(queen.getPosition(), b));

    }
}