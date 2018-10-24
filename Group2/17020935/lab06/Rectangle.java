/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author DELL
 */
public class Rectangle extends Shape {
    private int Width;
    private int Length;

    
    public Rectangle(){
        super();
        Length = Width = 6;
    }
    public Rectangle(int Length, int Width){
        super();
        this.Length = Length;
        this.Width = Width;
    }
    public Rectangle(int width, int length, int x, int y, String color, int Lx, int Ly, int Width, int Length){
        super(x, y, width, length, color);
        this.Width = Width;
        this.Length = Length;
    }

    public void drawRectangle(){
        System.out.println("Rectangle Length: " + this.Length);
        System.out.println("Rectangle Width: " + this.Width);
        this.drawShape();
    }
    public int getRectangleWidth() {
        return Width;
    }

    public int getRectangleLength() {
        return Length;
    }

    public void setRectangleLength(int Length) {
        this.Length = Length;
    }

    public void setRectangleWidth(int Width) {
        this.Width = Width;
    }
}