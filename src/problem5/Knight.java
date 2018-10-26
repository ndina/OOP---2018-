package problem5;

public class Knight extends Piece {
    public Knight(Position p) {
        super(p);
    }

    public boolean isLegalMove(Position a, Position b){
        return (inBorders(a, b) && Math.abs(a.X - b.X) * Math.abs(a.Y - b.Y) == 2);
    }
}