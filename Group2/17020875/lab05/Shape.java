public class Shape
{
    protected String color;
    protected boolean filled;

    Shape()
    {
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString()
    {
        String s = "shape";
        return s;
    }
}