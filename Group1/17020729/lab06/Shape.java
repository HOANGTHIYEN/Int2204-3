
package week5;

public abstract class Shape {
    int[] x;
    int []y;
    String color="red";
   public Shape(String color)
    {
        this.color=color;
          
}

    public Shape(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
}
