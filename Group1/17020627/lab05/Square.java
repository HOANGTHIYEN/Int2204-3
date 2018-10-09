package bai2tuan5;

public class Square extends Rectangle{
    protected double side;

    public Square() {
        this.length=4;
        this.width=4;
        this.side=4;
    }

    public Square(double side) {
        this.length=side;
        this.width=side;
        this.side=side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length=side;
        this.width=side;
    }
    
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setLength(double side) {
        
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" + "cạnh=" + side +
                ", Chuvi=" + side+side + ", S=" + side*side + '}';
    }    
    
}
