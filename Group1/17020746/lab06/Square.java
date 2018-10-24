package lb6;

public class Square extends Rectangle{
    private double side;

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setSide(double Side){
        super.setWidth(side);
        super.setLength(side);
        this.side = Side;
    }

    public double getSide(){
        return side;
    }

    public Square(){
        name = "Square";
    }

    public Square(double Side){
        this.side = Side;
        this.width = Side;
        this.length = Side;
    }

    public Square(double Side, int x, int y, int moveX, int moveY, String color, boolean filled, boolean pos){
        super(Side, Side, x, y, moveX, moveY, color, filled, pos);
        this.side = Side;
        name = "Square";
    }

    public String toString(){
        return super.toString() + side;
    }
}
