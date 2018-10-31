package lap6;

import java.awt.*;
import java.util.Arrays;

import static java.lang.Math.sqrt;

class Triangle extends Shape {
    public Triangle(){
        int a[]={140,160,180};
        int b[]={0,80,80};
        filled=true;
        x=a;
        y=b;
        color= Color.blue;
    }
    public Triangle(int[] x1, int[] y1) {
        x = x1;
        y = y1;
        color= Color.blue;
        if (x.length!=3||y.length!=3) filled=false;
            else{
                double a=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
                double b=Math.sqrt(Math.pow(x[0]-x[2],2)+Math.pow(y[0]-y[2],2));
                double c=Math.sqrt(Math.pow(x[2]-x[1],2)+Math.pow(y[2]-y[1],2));
                if(a+c>b&&a+b>c&&b+c>a) filled=true;
                        else filled = false;
        }
    }

    public Triangle(int x1[], int y1[], Color color, Boolean fill) {
        x = x1;
        y = y1;
        this.color = color;
        filled = fill;
        if (x.length!=3||y.length!=3) filled=false;
        else{
            double a=Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1],2));
            double b=Math.sqrt(Math.pow(x[0]-x[2],2)+Math.pow(y[0]-y[2],2));
            double c=Math.sqrt(Math.pow(x[2]-x[1],2)+Math.pow(y[2]-y[1],2));
            if(a+c>b&&a+b>c&&b+c>a) filled=true;
            else filled = false;
        }

    }

}
