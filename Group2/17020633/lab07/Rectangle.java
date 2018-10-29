/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Dell
 */

import javafx.scene.paint.Color;

public class Rectangle extends Shape {

     toado tam;
    protected double chieudai;
    protected double chieurong;
    
     public Rectangle(toado tam, double chieurong, double chieudai, Color color) {
        super(tam, color);
        this.tam = tam;
        this.chieurong =chieurong;
        this.chieudai = chieudai;
    }
     public Rectangle(toado tam, double chieurong, double chieudai) {
        super(tam);
        this.tam = tam;
        this.chieurong = chieurong;
        this.chieudai= chieudai;
    }
     
        @Override
    public void moved(toado newLocation) {
        this.tam = newLocation;
    }

    void setLayoutY(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLayoutX(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
