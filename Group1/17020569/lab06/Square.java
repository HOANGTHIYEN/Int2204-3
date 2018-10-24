package lab;

public class Square extends Rectangle {

    public Square(double side, Pos diemA) {
        this.width = side;
        this.length = side;
        this.diemA = diemA;
    }
    
    public Square(double width, double length, String color, boolean filled, Pos diemA) {
        super(color ,filled);
        this.width = width;
        this.length = length;
        this.diemA = diemA;
    }

    
    @Override
    public void setWidth(double side) {
       super.setWidth(side);
       super.setLength(side);
   }

    @Override
    public void setLength(double side) {
        super.setLength(side);
         super.setWidth(side);
    }
     @Override
    public String toString() {
        return "Square : Diem A(" + diemA.getX() + ", "+ diemA.getY() +") Side :" + this.width  +" Area : " +getArea() + "\tPerimeter : " + getPerimeter();
    }  
}