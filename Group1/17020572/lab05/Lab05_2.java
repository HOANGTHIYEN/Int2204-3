/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Admin
 */


    class Lab05_2{
        public String color ;
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        boolean filled ;
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        Lab05_2(){
            color = "red";
            filled = true;
        }
        Lab05_2(String a, boolean b){
            color = a;
            filled = b;
        }
        public String toString(){
            return "Color: "+color +"\nFilled: "+ filled;

        }
    }
    class circle extends Lab05_2{
        double radius;
        circle()
        {
            radius = 1.0;
        }
        circle(double x){

            radius = x;
        }
        circle(double x, String a, boolean b){
            radius =x ;
            color  = a;
            filled = b;
        }
        public final float PI = (float) 3.14;
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        public double getArea(){
            return PI*radius*radius;
        }
        public double getPerimeter(){
            return 2*PI*radius;
        }
        public String toString(){
            return "circle:"+"\nColor: "+color +"\nFilled: "+ filled+"\nRadius: " + getRadius() +"\narea: " + getArea() +"\nperimeter: " + getPerimeter();
        }

    }
    class rectangle extends Lab05_2{
        double width;
        double length;
        rectangle(){
            double width=1.0;
            double length=1.0;
        }
        rectangle(double x, double y){
            width = x;
            length = y;
        }
        rectangle(double x, double y, String a, boolean b){
            width = x;
            length = y;
            color = a ;
            filled = b;
        }

        public void setWidth(double width){
            this.width = width;
        }
        public double getWidth(){
            return width;
        }
        public void setLength(double length){
            this.length = length;
        }public double getLength(){
            return length;
        }
        public double getArea(){
            return getWidth()*getLength();
        }public double getPerimeter(){
            return 2*(getWidth()+getLength());
        }
        public String toString(){
            return "rectangle:"+ "\nColor: "+color +"\nFilled: "+ filled+"\nwidth: " + getWidth()+"\nlength: " + getLength() +"\narea: " + getArea() +"\nperimeter: " + getPerimeter();        }
    }
class square extends rectangle{
        double side;
        square(){
            side=1.0;
        }square(double x){
           super(x,x);
            side = x;
            
        }square(double x, String a, boolean b){
            super(x,x,a,b);
            side = x;
            color = a;
            filled = b;
            
        }
        public void setSide(double side){
            this.side = side;
            width = side;
            length = side;
        }
        public double getSide(){
        return side;
        }
        public void setWidth(double side){
            width = side;
            length = side;
            this.side = side;
        }
        public void setLength(double side){
            length = side;
            this.side = side;
            width = side;
        }
        public String toString(){
            return "square"+"\nColor: "+color +"\nFilled: "+ filled+"\nside: "+getSide()+"\narea: " + getArea() +"\nperimeter: " + getPerimeter();
        }
        public static void main(String[] args) {
        // TODO code application logic here
        square a= new square(1.5,"Black",true);
        circle b= new circle(4,"black",true);
        System.out.println(a.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(b.toString());
        rectangle c= new rectangle();
        System.out.println("-------------------------------------------------");
        System.out.println(c.toString());
    }

    }

    


