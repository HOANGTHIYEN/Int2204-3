/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Dell
 */
public class square extends Restangle {
    double Side;

    public square() {
        this.Side=1.0;
    }

   
    public square(double Side) {
        this.Side=Side;
        
    }

    public square(double Side, double width, double length, String color, boolean filled) {
        super(Side, Side, color, filled);
        this.Side = Side;
    }

   
    
    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        super.setLength(Side); 
        super.setWidth(Side);
    }
  
    

    @Override
    public String toString() {
        return "square{" + "Side=" + Side + '}';
    }
    
    public void setLength(double Side) {
        super.setLength(Side); 
        super.setWidth(Side);
    }
    
    public void setWidth(double Side) {
        super.setLength(Side); 
        super.setWidth(Side);
    }
    
}
