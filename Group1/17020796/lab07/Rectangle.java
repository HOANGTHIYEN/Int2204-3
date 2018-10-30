import java.awt.Graphics;


public class Rectangle extends Shape{
    private int x, y, cd, cr;

    public Rectangle(boolean fill, int x, int y, int cd, int cr) {
        super(fill);
        this.cd = cd;
        this.cr = cr;
        this.x = x;
        this.y = y;
    }

    public int getCd() {
        return cd;
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

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }
  public boolean ok(Rectangle r){
      if(this.x == r.x && this.y == r.y && this.cd == r.cd && this.cr == r.cr)
          return true;
      return false;
  }
  public void move(int x_new, int y_new){
       
        this.x = x_new;
        this.y = y_new;
    }
    
}