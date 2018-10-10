/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author MANH HOANG
 */
public class Square extends Rectangle{

    protected double size;
    protected double width;
    protected double length;
    
    public Square() {
        
    }
    
    public Square(double size) {
        this.size=size;
    }
    
    public Square(double size,String color,boolean filled) {
        super();
        this.size=size;
        
    }

    /**
     * @return the size
     */
    public double getSize() {
        return length;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        width=size;
        length = size;
    }

    
    @Override
    public void setWidth(double size) {
        this.setSize(size);
    }

    
    @Override
    public void setLength(double size) {
       this.setSize(size);
    }
    
    @Override
    public String toString() {
        return "kích thước:"+size +"   "+"màu:"+color +"   "+"trạng thái:"+filled;
    }
    public String tinhchuvi() {
        
        float a;
        
        a=(float) (4*size);
        return "chu vi:"+a;
    }
    
    public String tinhdientich() {
        float a = 0;
        a=(float) (size*size);
        return "dientich:"+a;
    }

}
