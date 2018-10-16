package lap5;
public class Shape {
    protected String Color;
    protected Boolean filled;

    public Shape(){
        this.Color="Red";
        this.filled=true;
    }


     public Shape(String color,Boolean filled) {
         this.Color = color;
         this.filled=filled;
     }

     public String getColor() {
         return Color;
     }

     public void setColor(String color) {
         Color = color;
     }

     public Boolean getFilled() {
         return filled;
     }

     public void setFilled(Boolean filled) {
         this.filled = filled;
     }

     @Override
     public String toString() {
         return "Shape{" +
                 "Color='" + Color + '\'' +
                 ", filled=" + filled +
                 '}';
     }
 }
