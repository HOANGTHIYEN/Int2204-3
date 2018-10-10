package shape;

public class Shape {

    String color ;
    Boolean fill ;

    public Shape(){
        this.color="red";
        this.fill=true;
    }
    
    public Shape(String color, Boolean fill) {
        this.color = color;
        this.fill = fill;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return  "color: " + color + ", fill: " + getFill() ;
    }
    
    
}
