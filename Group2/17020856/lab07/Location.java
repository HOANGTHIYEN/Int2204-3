package lap07;

public class Location {
    private int X=0,Y=0;

    public Location(int X, int Y) {
        this.X=X;
        this.Y=Y;
    }

    public Location() {
    }


    public void setPos(int x, int y) {
        X=x;
        Y=y;
    }

    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
}