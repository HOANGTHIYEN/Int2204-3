public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){
        this.side = 1.0;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        //this.setSide(side);
    }

    public void setWidth(double side){
        this.side = side;
        this.setWidth(side);
        this.setLength(side);
    }
    public void setLength(double side){
        this.side = side;
        this.setWidth(side);
        this.setLength(side);
    }

    public String toString(){
        return "side: " + this.getSide();
    }
}