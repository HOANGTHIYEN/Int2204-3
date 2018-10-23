/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

/**
 *
 * @author Do Tuan Bac
 */
public class Triangle extends Shape {
     protected double a=1;
    protected double b=1;
    protected double c=1;
     Triangle()
    {
        
    }
   Triangle(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
        Triangle(double width,double length)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
            Triangle(double width,double length,String color,boolean filled)
    {
        this.a=a;
        this.b=b;
        this.c=c;
         super.color=color;
           super.filled=filled;
    }
               @Override
    public String toString()
    {
        return "Hình tam giác có 3 cạnh lần lượt là : "+getA()+ " , "+getB()+" , "+getC();
        
    }
 
}
