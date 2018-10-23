package diagram.layer.shape;

import java.awt.*;

public class Shape
{
    protected Color color;
    protected boolean filled;

    Shape()
    {
        color = Color.ORANGE;
        this.filled = true;
    }
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;

    }
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }


}