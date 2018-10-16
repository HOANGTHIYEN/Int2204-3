package lab5;
public class Square extends Rectangle {
    public Square(){
        this.setWidth(1.0);
        this.setLength(1.0);
    }
    public Square(double s){
        super.width = s;
        super.length = s;
    }
    public Square(double s, String n, boolean i){
        super.width = s;
        super.length = s;
        this.setColor(n);
        this.setFilled(i);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double s){
        this.setWidth(s);
    }
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    } 
}
