package com.company;
/*
* Giả sử bạn cần viết một ứng dụng đồ họa với những thông tin thiết kế ban đầu như sau
    - Diagram: là lớp đại diện cho sơ đồ đang được vẽ
    - Layer: một đối tượng thuộc lớp Diagram có một hoặc nhiều đối tượng thuộc lớp Layer
    - Shape: là lớp đại diện cho các hình vẽ khác nhau (Rectangle, Square, Triangle, Circle).
Mỗi đối tượng Layer chứa nhiều đối tượng lớp Shape
    - Các hình vẽ có thuộc tính để xác định vị trí và kích thước
    - Các hình vẽ có thể được tô màu và có thể được di chuyển
*Hãy:
    - Định nghĩa các lớp trên (Diagram, Layer, Shape, Rectangle, Square, Triangle, Circle, và các lớp khác nếu cần thiết)
    - Bổ sung phương thức cho lớp Layer để xóa tất cả các đối tượng thuộc lớp Triangle trong lớp
    - Bổ sung phương thức cho lớp Diagram để xóa tất cả các đối tượng thuộc lớp Circle trong Diagram
    - Viết phương thức main để kiểm thử các phương thức trên
 */

import static java.lang.Math.sqrt;
import java.util.Vector;
    class toaDo{
        private double x, y;

        public toaDo() {
        }

        public toaDo(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
    abstract class Shape{
        protected String color = "red";         //chi truy cap ben ngoai class khi co tinh ke thua
        protected boolean filled = true;
        protected toaDo toaDoTam = new toaDo(3,5);
        public Shape(){

        }
        /*constructor*/
        public Shape(String color,boolean filled,toaDo toaDoTam){
            this.color=color;
            this.filled=filled;
            this.toaDoTam=toaDoTam;
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
        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public toaDo getToaDoTam() {
            return toaDoTam;
        }

        public void setToaDoTam(toaDo toaDoTam) {
            this.toaDoTam = toaDoTam;
        }
            public void Move(double x,double y){
                toaDoTam.setX(x);
                toaDoTam.setY(y);
            }


        public void info(){
            System.out.println("");
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
        public Circle(double radius,String color,boolean filled,toaDo toaDoTam)
        {
            super(color, filled, toaDoTam);
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
        public void info(){
            System.out.println("Circle : " + radius);
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
        public Rectangle(double width,double length,String color,boolean filled,toaDo toaDoTam){
            super(color, filled, toaDoTam);       //tham chiếu trực tiếp đến biến instance của lớp cha.
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
        @Override
        public void info(){
            System.out.println("Retangle : " + length + " " + width);
        }
    }

    class Square extends Rectangle {
        protected Square() {
            super();
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled, toaDo toaDoTam) {
            super(side, side, color, filled, toaDoTam);
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

        public void info(){
            System.out.println("Square : " + width);
        }
    }

    class Triangle extends Shape {
        protected double canh1, canh2, canh3;
        protected Triangle() {
            super();
        }

        public Triangle(double canh1, double canh2, double canh3) {
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
        }
        /*constructer*/
        public Triangle(double canh1, double canh2, double canh3, String color, boolean filled, toaDo toaDoTam) {
            super(color, filled, toaDoTam);
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
        }

        public double getCanh1() {
            return canh1;
        }

        public void setCanh1(double canh1) {
            this.canh1 = canh1;
        }

        public double getCanh2() {
            return canh2;
        }

        public void setCanh2(double canh2) {
            this.canh2 = canh2;
        }

        public double getCanh3() {
            return canh3;
        }

        public void setCanh3(double canh3) {
            this.canh3 = canh3;
        }

        public double getArea(){
            double p = (canh1 + canh2 + canh3)/2;
            return sqrt(p*(p - canh1)*(p - canh2)*(p - canh3));         //cong thuc Herong
        }
        public double getPerimeter(){
            return (canh1 + canh2 + canh3);
        }
        @Override
        public void info(){
            System.out.println("Tritangle : " + canh1 + " " + canh2 + " " + canh3);
        }
    }
    class Layer extends Vector<Shape> {
        public Layer(int initialCapacity) {
            super(initialCapacity);     //gọi hàm khởi tạo của lớp Shape
        }

        public Layer() {
            super(0);
        }       //khởi tạo giá trị của Layer vs index ban đầu bằng 0
        public void deleteTriangle(){
                for (int i = 0; i < this.size(); i++)         //size của vector Shape
                    if (this.elementAt(i) instanceof Triangle) {      //kiểm tra phần tử thứ i có thuộc lớp Triangle hay ko
                        this.remove(i);         //xóa phần tử thứ i nếu nó thuộc lớp Triangle
                        i--;
                    }

        }
    }
class Diagram extends Vector<Layer>{

    public Diagram() {
        super(0);
    }           //khởi tạo giá trị

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }           //gọi hàm khởi tạo của lớp Vector Shape

    public void deleteCircle(){
        for(int i = 0;i < this.size();i ++) {
            for (int j = 0; j < this.elementAt(i).size(); j++)             //size của phần tử trong vector Layer
                if (this.elementAt(i).elementAt(j) instanceof Circle) {       //kiểm tra phần tử được trả về có nằm trong class Circle hay ko
                    this.elementAt(i).remove(j);            //Gỡ bỏ phần tử tại vị trí đã cho trong Vector Layer
                    j--;       //giảm giá trị j vì size cũng sẽ được giảm khi remove(j) ra khỏi vector

                }
        }

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Diagram tri = new Diagram();
        Layer tri1 = new Layer();
        //test Layer
        tri1.add(new Triangle(6, 8, 10));           //thêm Triangle vào vector
        tri1.add(new Circle(4));
        tri1.add(new Rectangle(5, 10));

        System.out.println("-Ban dau : ");
        for(int i = 0;i < tri1.size();i ++)
            tri1.elementAt(i).info();

        tri1.deleteTriangle();  //xoa Triangle
        System.out.println("\n-Sau khi xoa Triangle: \n");

        for(int j = 0;j < tri1.size();j ++)
            tri1.elementAt(j).info();

        tri.add(tri1);  //thêm các đối tượng của lớp Layer vào lớp Diagram
        //test Diagram
        Layer tri2 = new Layer();
        tri2.add(new Circle(5));
        tri2.add(new Circle(6));
        tri2.add(new Rectangle(3,5));
        tri2.add(new Triangle(3, 4.7, 5));
        tri.add(tri2);  //them doi tuong cua Layer vào lớp Diagram
        System.out.println("\n-Ban dau : \n");
        for(int i = 0;i < tri.size();i ++){
            for(int j = 0;j < tri.elementAt(i).size();j ++)
                tri.elementAt(i).elementAt(j).info();
        }
        tri.deleteCircle();     //xóa Cirlce trong lớp
        System.out.println("\n-Sau khi xoa Circle :\n");
        for(int i = 0;i < tri.size();i ++){
            for(int j = 0;j < tri.elementAt(i).size();j ++) {
                tri.elementAt(j).elementAt(j).info();
            }
        }

    }
}
