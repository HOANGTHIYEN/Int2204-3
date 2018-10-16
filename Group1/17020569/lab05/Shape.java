package lab5;
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        this.color = "red";
        this.filled = true;        
    }
    public Shape(String n, boolean i){
        this.color = n;
        this.filled = i;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String n){
        this.color = n;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean i){
        this.filled = i;
    }
    @Override
    public String toString() {
        return color+" "+filled;
    }

}
