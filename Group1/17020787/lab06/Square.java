package lap6;

class Square extends Rectangle {

    public Square() {
    }

    public Square(String color, Boolean filled,toado center,double side) {
        super(side,side,color,filled,center);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return this.getLength() == this.getWidth() ? this.getLength() : -1.0D;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.setSide(side);
    }

    public void setLength(double side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Square{side" + this.getSide() + '}'+",color: "+this.getColor()+" "+center.toString();
    }
}