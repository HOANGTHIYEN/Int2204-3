public class Point{
    protected int x, y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public void draw(){
        System.out.println("Point: (" + x + "," + y + ")\n");
    }

    public void erase(){
        System.out.println("(" + x + "," + y + ")");
    }

    public void remove(int x_new, int y_new){
        x = x_new;
        y = y_new;
    }
}
