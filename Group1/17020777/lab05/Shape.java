/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author CCNE
 */
public class Shape {

    String color="red";
    boolean filled=true;
    /**
     * @param args the command line arguments
     */
    
    public Shape() {
        
    }
    
    public Shape(String color,boolean filled) {
        this.color=color;
        this.filled=filled;
    }
    

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
    
    
    @Override
    public String toString() {
        return "màu:"+color+"   "+"trạng thái:"+filled;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Shape h1 = new Shape();
        System.out.println(h1.toString());
        Circle h2 = new Circle();
        Rectangle h3 = new Rectangle();
        Square h4 = new Square(2.3);
        System.out.println();
        System.out.println("hình tròn");
        System.out.println();
        System.out.println(h2.toString());
        System.out.println(h2.tinhchuvi());
        System.out.println(h2.tinhdientich());
        System.out.println();
        System.out.println("hình chữ nhật");
        System.out.println();
        System.out.println(h3.toString());
        System.out.println(h3.tinhchuvi());
        System.out.println(h3.tinhdientich());
        System.out.println();
        System.out.println("hình vuông");
        System.out.println();
        System.out.println(h4.toString());
        System.out.println(h4.tinhchuvi());
        System.out.println(h4.tinhdientich());
    }
    
    
}