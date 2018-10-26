package problem5;

public class Bishop extends Piece{
    public Bishop(Position p) {
        super(p);
    }

    public boolean isLegalMove(Position a, Position b){
        return (inBorders(a, b) && Math.abs(a.X - b.X) == Math.abs(a.Y - b.Y));
    }
}