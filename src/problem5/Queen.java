package problem5;

public class Queen extends Piece {
    public Queen(Position p) {
        super(p);
    }

    public boolean isLegalMove(Position a, Position b){
        return (inBorders(a, b) && (a.X == b.X || a.Y == b.Y || Math.abs(a.X - b.X) == Math.abs(a.Y - b.Y)));
    }
}