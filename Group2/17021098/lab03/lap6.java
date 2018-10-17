/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import static java.lang.Math.sqrt;
import java.util.Vector;

/**
 *
 * @author Genius
 */
class Toado{
    private double x, y;

    public Toado() {
    }

    public Toado(double x, double y) {
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
class Shape{
    protected String color;
    protected boolean filled;
    protected Toado tam;
    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled, Toado tam) {
        this.color = color;
        this.filled = filled;
        this.tam = tam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }
    public void dichuyen(double dodai, String huong){
        switch (huong) {
            case "bac":
                tam.setY(tam.getY() + dodai);
                break;
            case "nam":
                tam.setY(tam.getY() - dodai);
                break;
            case "dong":
                tam.setX(tam.getX() + dodai);
                break;
            case "tay":
                tam.setX(tam.getX() - dodai);
                break;
            default:
                break;
        }
    }
    public void info(){
        System.out.println("");
    }
}
@SuppressWarnings("serial")
class Layer extends Vector <Shape>{

    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }
    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
}
@SuppressWarnings("serial")
class Diagram extends Vector<Layer>{

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void eraseCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}
@SuppressWarnings("serial")
class Cricle extends Shape{
    protected double radius;
    final double pi = 3.14;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    @Override
    public void info(){
        System.out.println("Day la hinh tron: (ban kinh) " + radius);
    }
}

class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.width = width;
        this.length = length;
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
        return (width + length)*2;
    }
    @Override
    public void info(){
        System.out.println("Day la hinh chu nhat: (chieu dai, chieu rong) " + length + " " + width);
    }
}
class Triangle extends Shape{
    protected double c1, c2, c3;
    protected Toado[] tg = new Toado[3];

    public Triangle() {
    }

    public Triangle(double c1, double c2, double c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Triangle(double c1, double c2, double c3, String color, boolean filled, Toado tam) {
        super(color, filled, tam);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    
    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }