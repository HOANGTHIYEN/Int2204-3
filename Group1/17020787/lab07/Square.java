package lap6;

import java.awt.*;

class Square extends Rectangle {
    public Square(){
        int a[]={80,120,120,80};
        int b[]={0,0,40,40};
        x=a;
        y=b;
        filled=true;
        color= Color.BLACK;
    }
    public Square(int[] x1,int[] y1){
        x=x1;
        y=y1;
        color=Color.BLACK;
        check();
        if(x.length==4&&y.length==4){
        double a=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
        double b=Math.sqrt(Math.pow(x[0]-x[3],2)+Math.pow(y[0]-y[3],2));
        if(a!=b) filled=false;}

    }
    public Square(Color color,Boolean fill,int[] x1,int[] y1){
        this.color=color;
        filled=fill;
        x=x1;
        y=y1;
        check();
        double a=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
        double b=Math.sqrt(Math.pow(x[0]-x[3],2)+Math.pow(y[0]-y[3],2));
        if(a!=b) filled=false;
        if(filled)
            if(!fill)
                filled=false;

    }
}