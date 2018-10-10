package lab05;

public class Square extends Rectangle {
    public Square() {
        super();
        
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
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
        return super.toString();
    }
}