
package week5;

class Circle extends Shape{
   double radius=1.0;
  final double pi=3.14;

   
    

    
   

    public Circle(double radius,String color) {
        super(color);
        this.radius=radius;
        
    }

    public Circle(int[] x, int[] y) {
        super(x, y);
    }
    
  
   public double getRadius()
   {
       return radius;
       
   }
   public void setRadius(double radius)
   {
       this.radius=radius;
   }
  
}
