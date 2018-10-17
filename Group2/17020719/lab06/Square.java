public class Square extends Rectangle{
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length =side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    public Square() {
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled, Point point){
        super(side, side, color, filled, point);
    }

    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public double getArea(){
        return length * width ;
    }

    @Override
    public double getPerimeter(){
        return width * 4;
    }

    @Override
    public String toString(){
        String str = "Square" + "\nSide: " + width + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        return str;
    }
}
