package shape;

public class Square extends Rectangle{
    
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square( double side,String color, boolean fill) {
        super(side, side,color, fill);
    }

    public void setWidth (double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
