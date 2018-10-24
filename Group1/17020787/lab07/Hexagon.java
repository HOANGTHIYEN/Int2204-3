package lap6;

import java.awt.*;

public class Hexagon  extends Shape{
    public Hexagon (){
        color= Color.magenta;
        int a[]={30,80,110,80,30,0};
        int b[]={50,50,90,130,130,90};
        x=a;
        y=b;
        this.filled=true;
    }
    public Hexagon(int[] x6,int[] y6){
        color=Color.magenta;
        x=x6;
        y=y6;
        check();

    }
    public Hexagon(int[] x6,int [] y6,Color color,Boolean fill){
        this.color=color;
        x=x6;
        y=y6;
        check();
        if(filled)
            if(!fill)
                filled=false;
    }
    public void check(){
        if(x.length!=6||y.length!=6) filled=false;
        else {
            double a = Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2));
            double b = Math.sqrt(Math.pow(x[0] - x[5], 2) + Math.pow(y[0] - y[5], 2));
            double c = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
            double d = Math.sqrt(Math.pow(x[3] - x[2], 2) + Math.pow(y[3] - y[2], 2));
            double e = Math.sqrt(Math.pow(x[3] - x[4], 2) + Math.pow(y[3] - y[4], 2));
            double f = Math.sqrt(Math.pow(x[4] - x[5], 2) + Math.pow(y[4] - y[5], 2));
            if(a == b && b == c && c == d && d == e && e == f)
                filled= true;
            else{ filled = false;}
        }
    }
}
