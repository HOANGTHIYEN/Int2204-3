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
public class Square extends Rectangle {
    protected double size;
    protected double width;
    protected double length;
    
    public Square() {
        
    }
    
    public Square(double size) {
        super(size,size);
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
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSide(double size) {
        this.size = size;
        this.width = size;
        this.length = size;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.size = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
        this.size = length;
    }
    @Override
    public void info(){
        System.out.println("Day la hinh vuong: (do dai canh) " + size);
    }
}
