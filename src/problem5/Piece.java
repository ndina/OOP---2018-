package problem5;

public abstract class Piece {
    Position p;
    public Piece(Position p) {
        this.p = p;
    }
    public abstract boolean isLegalMove(Position a, Position b);

    public boolean inBorders(Position a, Position b) {
        return (Position.inBorders(a) && Position.inBorders(b));
    }

    public Position getPosition() {
        return this.p;
    }
}