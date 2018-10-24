/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
import javafx.scene.paint.Color;

/**
 *
 * @author Dell
 */


public class Triangle extends Shape {

    double [] point = new double [6];
    public Triangle (toado dinh1, toado dinh2, toado dinh3, Color color) {
        super(dinh1, color);
        this.point[0]=dinh1.x;
        this.point[1]=dinh1.y;
        this.point[2]=dinh2.x;
        this.point[3]=dinh2.y;
        this.point[4]=dinh3.x;
        this.point[5]=dinh3.y;
    }
     public Triangle (toado dinh1, toado dinh2, toado dinh3 ) {
        super(dinh1 );
        this.point[0]=dinh1.x;
        this.point[1]=dinh1.y;
        this.point[2]=dinh2.x;
        this.point[3]=dinh2.y;
        this.point[4]=dinh3.x;
        this.point[5]=dinh3.y;
    }
     @Override
    public void moved(toado n ) {
        this.point[0]=n .x;
        this.point[1]=n .y;
    }
}
