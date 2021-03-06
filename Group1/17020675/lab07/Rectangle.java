
import java.awt.Color;

public class Rectangle extends Shape {
    protected int width=1;
    protected int length=1;
    
    Rectangle()
    {       
    }
    Rectangle(int width,int length)
    {
        this.width=width;
        this.length=length;
    }
    Rectangle(int width,int length,Color color,boolean filled)
    {
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    Rectangle(int width,int length,Color color,boolean filled,int X,int Y)
    {
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
        this.X=X;
        this.Y=Y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
   
  
}