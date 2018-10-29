/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import javafx.scene.paint.Color;

/**
 *
 * @author CCNE
 */
public class Triangle extends Shape{
    double [] points = new double [6];
    public Triangle(Position vertice1, Position vertice2, Position vertice3, Color color) {
        super(vertice1, color);
        this.points[0]=vertice1.x;
        this.points[1]=vertice1.y;
        this.points[2]=vertice2.x;
        this.points[3]=vertice2.y;
        this.points[4]=vertice3.x;
        this.points[5]=vertice3.y;
    }

    public Triangle(Position vertice1, Position vertice2, Position vertice3) {
        super(vertice1);
        this.points[0]=vertice1.x;
        this.points[1]=vertice1.y;
        this.points[2]=vertice2.x;
        this.points[3]=vertice2.y;
        this.points[4]=vertice3.x;
        this.points[5]=vertice3.y;
    }


    @Override
    public void moving(Position newLocation) {
        this.points[0]=newLocation.x;
        this.points[1]=newLocation.y;
    }
}
