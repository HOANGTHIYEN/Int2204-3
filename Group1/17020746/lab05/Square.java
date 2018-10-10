package lb5;

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

    public Square(){}

    public Square(double Side){
        this.side = Side;
        this.width = Side;
        this.length = Side;
    }

    public Square(double Side, String color, boolean filled){
        super(Side, Side, color, filled);
    }

    public String toString(){
        return super.toString();
    }
}
