
package week5;


public class Rectangle extends Shape {
    double width=1;
    double length=1;
    
    
    public Rectangle(double width,double length,String color) {
        super(color);
        this.length=length;
        this.width=width;
        
    }

    public Rectangle(int[] x, int[] y) {
        super(x, y);
    }

    @Override
    public int[] getX() {
        return x;
    }

    @Override
    public void setX(int[] x) {
        this.x = x;
    }

    @Override
    public int[] getY() {
        return y;
    }

    @Override
    public void setY(int[] y) {
        this.y = y;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

  
   
   public double getLength()
   {
       return length;
       
   }
   public void setLength(double length)
   {
       this.length=this.length;
   }
  public double getWidth()
   {
       return width;
       
   }
   public void setWidth(double width)
   {
       this.width=this.width;
   }
}
