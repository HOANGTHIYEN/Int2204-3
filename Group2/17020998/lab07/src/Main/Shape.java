package Main;

import java.awt.*;

public abstract class Shape extends Layer{
    protected boolean filled;
    private int index;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    abstract public void moveTo(int new_x, int new_y);

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


}
