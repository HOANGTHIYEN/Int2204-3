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
public class Circle extends Shape{
    protected double radius=1.0;;
    protected double Area;
    protected double Perimeter;
    final double PI=3.14;
    public Circle() {
        
    }
    public Circle(double radius) {
        this.radius=radius;
    }
    
    public Circle(double radius,String color,boolean filled,Vitri vitri) {
        super(color,filled,vitri);
        this.radius=radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
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
        System.out.println("Day la hinh tron: (ban kinh) " + radius);
    }
}
