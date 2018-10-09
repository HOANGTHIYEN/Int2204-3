public class Square extends Rectangle {
    private double side;

    public Square() {
        new Rectangle();
    }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
        new Rectangle(super.getWidth(), super.getLength());
    }

    public Square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
        new Rectangle(super.getWidth(), super.getLength(), super.getColor(), super.getFilled());
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return side+ "\t" + super.toString();
    }
}

