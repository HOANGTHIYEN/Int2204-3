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
class Rectangle extends Shape
{
   protected Double width;
   protected Double length;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
     Rectangle()
    {
        this.width=1.0;
        this.length=1.0;
    }
     Rectangle(Double width, Double length)
     {
         this.width=width;
         this.length=length;
     }
      Rectangle(Double width, Double length, String color,Boolean fill)
      {
          super(color,fill);
          this.width=width;
          this.length=length;
      }
       public Double getArea()
    {
        Double area;
        area=(width+length)*2;
        return area;
    }
     public Double getPerimeter()
    {
        Double pre;
        pre=width*length;
        return pre;
    }

}