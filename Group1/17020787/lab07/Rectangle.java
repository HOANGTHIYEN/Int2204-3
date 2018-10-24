package lap6;

import java.awt.*;

class Rectangle extends Shape{

    public Rectangle(){
        int a[]={0,60,60,0};
        int b[]={0,0,40,40};
        x=a;
        y=b;
        filled=true;
        color= Color.RED;
    }
    public Rectangle(int[] x1,int[] y1){
        x=x1;
        y=y1;
        color=Color.RED;
        check();
    }
    public Rectangle(Color color,Boolean fill,int[] x1,int[] y1){
        this.color=color;
        x=x1;
        y=y1;
        check();
        if(filled)
            if(!fill)
                filled=false;

    }
    public void check(){
        if (x.length!=4||y.length!=4) filled=false;
        else{
            double a=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
            double b=Math.sqrt(Math.pow(x[3]-x[2],2)+Math.pow(y[3]-y[2],2));
            //double c=Math.sqrt(Math.pow(x[2]-x[1],2)+Math.pow(y[2]-y[1],2));
            int c=(x[0]-x[1])*(x[0]-x[3])+(y[0]-y[1])*(y[0]-y[3]);

            if(a==b&&c==0) filled=true;
            else filled = false;

        }
    }
}
