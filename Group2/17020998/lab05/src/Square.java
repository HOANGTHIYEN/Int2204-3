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
        return this.width;
    }

    public void setSide(double side) {
         this.width = side;
         this.length = side;
    }

    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    public void setLength(double side){
        this.length = side;
        this.width  = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
