/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_05_2;



/**
 *
 * @author Admin
 */
class Circle extends Shape
{
    protected Double radius;
    protected Double PI=3.14;
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    Circle()
    {
        this.radius=0.1;
    }
    Circle (Double radius)
    {
        this.radius=radius;
    }
    Circle(Double radius,String color,Boolean fill)
    {
        super(color,fill);
      
        this.radius=radius;
    }
    public Double getArea()
    {
        Double area;
        area=radius*radius*PI;
        return area;
    }
     public Double getPerimeter()
    {
        Double pre;
        pre=2*radius*PI;
        return pre;
    }

}
