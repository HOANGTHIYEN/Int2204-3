package lab05;

public class Rectangle extends Shape {
	protected double width;
    protected double length;
    
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    } 
    public Rectangle(double w, double l){
        this.length = l;
        this.width = w;
    } 
    public Rectangle(double w, double l, String n, boolean i){
    	super(n,i);
        this.width = w;
        this.length = l;
        
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
    // tinh dien tich
    public double getArea(){
        return this.length*this.width;
    }
    // tinh chu vi
    public double getPerimeter(){
        return this.length*2+this.width*2;
    }
    @Override
    public String toString(){
        return "Mau: " + this.getColor()+" - Fill: "+this.isFilled()+" - Dien tich: "+this.getArea()+" - Chu vi: "+this.getPerimeter();
    }
}
