package lab06;

public class Circle extends Shape{
    private ToaDo tam;
    private double radius;
    final double PI = 3.14;
    public Circle () {}
      public Circle (double radius, ToaDo tam)
    {
        super();
        this.tam = tam;
        this.radius = radius;
    }
      
     public double getArea()
    {
        return radius * radius *PI;
    }
    public double getPerimeter()
    {
        return 2*PI*radius;
    }
     public void move(int x, int y) {
         tam.setX(tam.getX() + x);
         tam.setY(tam.getY() + y);
     }
    @Override
    public String toString() {
        return "Circle : Tam" + "(" + tam.getX() + ", "+ tam.getY() + ") Area : " +getArea() + "\tPerimeter : " + getPerimeter();
    }   
    
    
}
