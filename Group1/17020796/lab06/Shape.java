
//lớp đại diện cho các hình vẽ khác nhau (Rectangle, Square, Triangle, Circle).

public abstract class Shape {
    protected String color = "Blue";
    protected boolean filled;
    // hình kín hay k và có màu gì

    public Shape () {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}