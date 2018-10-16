public class Square extends Rectangle {
    protected double side;
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled, Coordinates center) {
        super(side, side, color, filled,center);
    }
    public void setSide(double side) {
        this.width=side;
        this.length=side;
        this.side=side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }
    @Override
    public void info(){
        System.out.println("Day la hinh vuong: (do dai canh) " + getSide());
    }
}
