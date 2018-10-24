package Lab07;

class Square extends Rectangle{
    protected double side;
    public Square(){

    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }
    public Square(double side, String color, boolean filled, Location mid) {
        super(side, side, color, filled, mid);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    public void showInfo() {
        System.out.println("Hình vuông{" + "cạnh=" + side + ", màu='" + color + '\'' + ", filled=" + filled + ", vị trí=" + mid + '}');
    }
}
