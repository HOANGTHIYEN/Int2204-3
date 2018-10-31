
package lap_06;

import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class TriangleObject extends Shape {

//toa do 2 dinh con lai
    double [] top= new double [6];
    public TriangleObject(XYlocation vertice1, XYlocation vertice2, XYlocation vertice3, Color color) {
        super(vertice1, color);
        this.top[0]=vertice1.x;
        this.top[1]=vertice1.y;
        this.top[2]=vertice2.x;
        this.top[3]=vertice2.y;
        this.top[4]=vertice3.x;
        this.top[5]=vertice3.y;
    }

    public TriangleObject(XYlocation vertice1, XYlocation vertice2, XYlocation vertice3) {
        super(vertice1);
        this.top[0]=vertice1.x;
        this.top[1]=vertice1.y;
        this.top[2]=vertice2.x;
        this.top[3]=vertice2.y;
        this.top[4]=vertice3.x;
        this.top[5]=vertice3.y;
    }


    @Override
    public void moving(XYlocation newLocation) {
        this.top[0]=newLocation.x;
        this.top[1]=newLocation.y;
    }
}
