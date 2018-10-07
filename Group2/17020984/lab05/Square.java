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

        this.setSide(side);
        this.setColor(color);
        this.setFilled(filled);
    }
}