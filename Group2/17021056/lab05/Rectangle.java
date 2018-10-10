/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package câu.pkg2.lab05;

/**
 *
 * @author Administrator
 */
public class Rectangle extends Shape{ //hình chữ nhật
       public
       double width; //chiều rộng
       double length;//chiều dài

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
    public Rectangle()
    {    
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width,double length )
    {   
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length , String color ,boolean filled )
    {   
        this.width=width;
        this.length=length;
        super.setColor(color);
        super.setFilled(filled);       
    }        
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return width+"\t"+length+"\t"+super.toString();
    }
}
    