
package lab07;

import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
//triagle ke thua lop shape
public class TriangleObject extends Shape {

//toa do 2 dinh con lai
    double [] points = new double [6];
    public TriangleObject(XYlocation vertice1, XYlocation vertice2, XYlocation vertice3, Color color) {
        super(vertice1, color);
        this.points[0]=vertice1.x;
        this.points[1]=vertice1.y;
        this.points[2]=vertice2.x;
        this.points[3]=vertice2.y;
        this.points[4]=vertice3.x;
        this.points[5]=vertice3.y;
    }

    public TriangleObject(XYlocation vertice1, XYlocation vertice2, XYlocation vertice3) {
        super(vertice1);
        this.points[0]=vertice1.x;
        this.points[1]=vertice1.y;
        this.points[2]=vertice2.x;
        this.points[3]=vertice2.y;
        this.points[4]=vertice3.x;
        this.points[5]=vertice3.y;
    }


    @Override
    public void moving(XYlocation newLocation) {
        this.points[0]=newLocation.x;
        this.points[1]=newLocation.y;
    }
}
