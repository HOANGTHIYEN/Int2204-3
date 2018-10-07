public class Square extends Rectangle{
    private double side;

    Square(){
        super();
    }

    Square(double side){
        super(side,side);
    }

    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.length = side;
    }

}
