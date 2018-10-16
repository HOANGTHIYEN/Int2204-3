package lb5;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    //Khởi tạo
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public Shape(){
    }

    public String toString(){
        return "color = " + color + "; filled = " + filled;
    }
}
