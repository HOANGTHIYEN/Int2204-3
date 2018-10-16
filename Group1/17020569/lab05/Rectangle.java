package lab5;
public class Rectangle extends Shape {
    public double width;
    public double length;
    
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    } 
    public Rectangle(double w, double l){
        this.length = l;
        this.width = w;
    } 
    public Rectangle(double w, double l, String n, boolean i){
        this.width = w;
        this.length = l;
        this.setColor(n);
        this.setFilled(i);
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double w){
        this.width = w;
    }
    public void setLength(double l){
        this.length = l;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return this.length*2+this.width*2;
    }
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    }
}
