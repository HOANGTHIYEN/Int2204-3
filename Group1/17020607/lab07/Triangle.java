/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.awt.Color;

public class Triangle extends Shape {

    private int[] tx = new int[3];
    private int[] ty = new int[3];

    public int[] getTx() {
        return tx;
    }

    public void setTx(int[] tx) {
        this.tx = tx;
    }

    public int[] getTy() {
        return ty;
    }

    public void setTy(int[] ty) {
        this.ty = ty;
    }

    public Triangle(Color color, boolean filled, int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
        super(x, y, filled, color);
        this.tx[0] = x1;
        this.tx[1] = x2;
        this.tx[2] = x3;
        this.ty[0] = y1;
        this.ty[1] = y2;
        this.ty[2] = y3;
    }

    public void moveTri(int x, int y) {

        this.tx[0] = tx[0] + x;
        this.tx[1] = tx[1] + x;
        this.tx[2] = tx[2] + x;
        this.ty[0] = ty[0] + y;
        this.ty[1] = ty[1] + y;
        this.ty[2] = ty[2] + y;
    }
}
