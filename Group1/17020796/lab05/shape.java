package bai2;

public class shape {
    private String color;
    private boolean filled;

    //constructor
    public shape(){
        color = "red";
        filled = true;
    }
    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        if (isFilled()) {
            return ("Hinh co mau " + getColor() + " va duoc lap day");
        }
        else {
            return ("Hinh co mau " + getColor() + " nhung khong duoc lap day");
        }
    }
}
