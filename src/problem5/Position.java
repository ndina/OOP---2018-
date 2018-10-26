package problem5;

public class Position {
    int X;
    int Y;

    public Position(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public static boolean inBorders (Position p) {
        return (p.X > 0  && p.X < 9 && p.Y > 0  && p.Y < 9);
    }
}