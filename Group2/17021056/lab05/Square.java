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
public class Square extends Rectangle {
    private double side; //cạnh

    public Square() {
      
    }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
      
    }
@Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
     }    
    public void setlength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }  
    public Square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
        
    }

   

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}