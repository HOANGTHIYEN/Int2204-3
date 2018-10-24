
package week5;

public class Square extends Rectangle{
    private double Side;
    public Square(double Side, String color) {
        super(Side, Side, color);
        
    }

  
    public Square(int[] x, int[] y) {
        super(x, y);
    }
    

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(Side);
        super.setLength(Side);
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
       super.setWidth(Side);
        super.setLength(Side);
    }
    
    @Override
    public String toString() {
        return super.toString();   
     
}
}
