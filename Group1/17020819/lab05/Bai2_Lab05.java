package com.company;

//3 quan he thua ke
    class Shape{
        protected String color = "red";         //chi truy cap ben ngoai class khi co tinh ke thua
        protected boolean filled = true;
        public Shape(){
        }
        /*constructor*/
        public Shape(String color,boolean filled){
            this.color=color;
            this.filled=filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }               //getFiller
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        public String toString()
        {
            return getColor()+"\t"+isFilled();
        }
    }

    class Circle extends Shape{
        protected double radius = 1.0;
        protected final double PI = 3.14;
        public Circle() {
            super();
        }
        public Circle(double radius){
            this.radius=radius;
        }
        /*constructor*/
        public Circle(double radius,String color,boolean filled)
        {
            super(color, filled);
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea(){
            return PI*getRadius()*getRadius();
        }
        public double getPerimeter(){
            return 2*PI*this.radius;
        }
        public String toString()
        {
            return radius + "\t" + super.toString();
        }
    }
    class Rectangle extends Shape{
        protected double width = 1.0;
        protected double length = 1.0;
        public Rectangle(){
            super();
        }
        public Rectangle(double width,double length){
            this.width=width;
            this.length=length;
        }
        public Rectangle(double width,double length,String color,boolean filled){
            super(color, filled);       //tham chiếu trực tiếp đến biến instance của lớp cha.
            this.width=width;
            this.length=length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea(){
            return width*length;
        }
        public double getPerimeter(){
            return 2*(width+length);
        }
        public String toString(){
            return width + "\t" + length + "\t" + super.toString();
        }
    }

    class Square extends Rectangle {
        protected Square() {
            super();
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return super.getWidth();
        }       //tra ve width vs width=side

        public void setSide(double side) {
            width = side;
            length = side;
        }
        //goi ham setSide(side) de cai dat lai setWidth sao cho width=side
        public void setWidth(double side) {
            setSide(side);
        }

        public void setLength(double side) {
            setSide(side);
        }

        @Override           //ghi de phuong thuc
        public String toString() {
            return width + "\t" + super.toString();
        }
    }
    public class Bai2_Lab05 {
        public static void main(String[] args) {
                Circle c1 = new Circle(3);
                System.out.println(c1);
                System.out.println("The color of circle : " + c1.getColor());
                System.out.println("The filled of circle : " + c1.isFilled());
                System.out.println("The radius of circle : " + c1.getRadius());
                System.out.println("The area of circle : " + Math.round((c1.getArea()*100)/100));       // lam tron den 2 chu so thap phan sau dau phay
                System.out.println("The perimeter of circle : " + Math.round((c1.getPerimeter()*100)/100)+"\n");
                Rectangle r1 = new Rectangle(8.3, 10.2);
                System.out.println(r1);
                System.out.println("The color of rectangle : " + r1.getColor());
                System.out.println("The filled of rectangle : " + r1.isFilled());
                System.out.println("The width of rectangle : " + r1.getWidth());
                System.out.println("The length of rectangle : " + r1.getLength());
                System.out.println("The area of rectangle : " + Math.round((r1.getArea()*100)/100));
                System.out.println("The perimeter of rectangle " + Math.round((r1.getPerimeter()*100)/100)+"\n");
                Square s1 = new Square(3.5);
                System.out.println(s1);
                System.out.println("The color of squape : " + s1.getColor());
                System.out.println("The filled of squape : " + s1.isFilled());
                System.out.println("The side of squape : " + s1.getWidth());
                System.out.println("The area of squape : " + Math.round((s1.getArea()*100)/100));
                System.out.println("The perimeter of squape : " + Math.round((s1.getPerimeter()*100)/100));

        }
    }

