public class Circle extends Shape{
    private int x, y, radius;
    public Circle( boolean b, int x, int y, int radius){
        super(b);
        this.radius = radius;
        this.x  =x;
        this.y  =y;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public boolean ok(Circle c){
        if(this.x == c.x && this.y == c.y && this.radius == c.radius)
            return true;
        return false;
    }
    public void move(int x_new, int y_new){
       
        this.x = x_new;
        this.y = y_new;
    }
    
}