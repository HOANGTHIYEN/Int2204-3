package shape;

public class Rectangle extends Shape {
     Double width;
     Double length;

     public Rectangle(){
        this.width=1.0;
        this.length=1.0;
     }
     
    public Rectangle(Double width, Double length){
        this.width = width;
        this.length = length;
    }
     
    public Rectangle(Double width, Double length, String color, Boolean fill) {
        super(color, fill);
        this.width = width;
        this.length = length;
    }


    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    
    public Double getArea(){
        return this.width*this.length;
    }
    
    public Double getPerimeter(){
        return 2*(this.width+this.length);
    } 


    @Override
    public String toString() {
        return  "Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
   
    
    
}
