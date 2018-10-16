package lab06;

public class Square extends Rectangle {

    public Square(double side, ToaDo diemA) {
        super(side, side, diemA);
    }
    
    public Square(double width, double length, String color, boolean filled, ToaDo diemA) {
        super(width, length, color, filled, diemA);
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
