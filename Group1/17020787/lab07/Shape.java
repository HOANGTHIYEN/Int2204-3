package lap6;
import java.awt.*;


public class Shape extends Canvas {
    protected  Color color;
    protected Boolean filled;
    protected toado center;
    protected int[] x;
    protected int[] y;
    //public abstract String toString();
    protected toado[] toadod=new toado[3];

    public Shape() {
        this.color = Color.RED;
        this.filled = true;
        center=new toado();
    }

    public Shape(Color color, Boolean filled, toado center) {
        this.color = color;
        this.filled = filled;
        this.center = center;
    }
    public int[] getx(){
        return x;
    }

    public void setx(int[] x) {
        this.x = x;
    }

    public int[] gety() {
        return y;
    }

    public void sety(int[] y) {
        this.y = y;
    }


    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return this.filled;
    }

    public toado getCenter() {
        return center;
    }

    public void setCenter(toado center) {
        this.center = center;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public void paint  (Graphics g) {
        setForeground(color);
        g.fillPolygon(x,y,x.length);
    }


    public void dichuyen(int dodai, String huong) {
        switch (huong) {
            case "tren":
                for (int i=0;i<y.length;i++)
                    y[i]=y[i]-dodai;
                break;
            case "duoi":
                for (int i=0;i<y.length;i++)
                    y[i]=y[i]+dodai;
                break;
            case "trai":
                for (int i=0;i<x.length;i++)
                    x[i]=x[i]-dodai;
                break;
            case "phai":
                for (int i=0;i<x.length;i++)
                    x[i]=x[i]+dodai;
                break;
            default:
                break;
        }

    }
}
