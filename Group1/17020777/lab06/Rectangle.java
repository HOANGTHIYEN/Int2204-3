/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author MANH HOANG
 */
public class Rectangle extends Shape {
    protected double width=1.0;
    protected double length=1.0;
    protected double Area;
    protected double Perimeter;
    
    public Rectangle() {
        
    }
    
    public Rectangle(double width,double length) {
        this.width=width;
        this.length=length;
    }
    
    public Rectangle(double width,double length,String color,boolean filled,Vitri vitri) {
        super(color,filled,vitri);
        this.width=width;
        this.length=length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the Area
     */
    public double getArea() {
        return Area;
    }

    /**
     * @param Area the Area to set
     */
    public void setArea(double Area) {
        this.Area = Area;
    }

    /**
     * @return the Perimeter
     */
    public double getPerimeter() {
        return Perimeter;
    }

    /**
     * @param Perimeter the Perimeter to set
     */
    public void setPerimeter(double Perimeter) {
        this.Perimeter = Perimeter;
    }
    @Override
    public void info(){
        System.out.println("Day la hinh chu nhat: (chieu dai, chieu rong) " + length + " " + width);
    }
}
