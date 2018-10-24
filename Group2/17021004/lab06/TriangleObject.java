
package lab06;

import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoangson
 */
//triagle ke thua lop shape
public class TriangleObject extends Shape {

//toa do 2 dinh con lai
    XYlocation vertice1;
    XYlocation vertice2;
    XYlocation vertice3;

    public TriangleObject(XYlocation vertice1, XYlocation vertice2, XYlocation vertice3, Color color) {
        super(vertice1, color);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public TriangleObject(XYlocation vertice1, XYlocation vertice2, XYlocation vertice3) {
        super(vertice1);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }


    @Override
    public void moving(XYlocation newLocation) {
        this.vertice1 = newLocation;
    }
}
