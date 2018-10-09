package lab05;

public class Square extends Rectangle {
    public Square(){
        this.setWidth(1.0);
        this.setLength(1.0);
    }
    public Square(double s){
        this.setWidth(s);
        this.setLength(s);
    }
    public Square(double s, String n, boolean i){
    	this.setWidth(s);
        this.setLength(s);
        this.setColor(n);
        this.setFilled(i);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double s){
    	this.setWidth(s);
    }
    @Override
    public void setWidth(double s) {
    	super.setLength(s);
    	super.setWidth(s);
    }
    public void setLength(double s) {
    	super.setLength(s);
    	super.setWidth(s);
    }
    
    public String toString(){
        return "Mau:" + this.getColor()+" - Fill: "+this.isFilled()+" - Dien tich: "+this.getArea()+" - Chu vi: "+this.getPerimeter();
    } 
}
