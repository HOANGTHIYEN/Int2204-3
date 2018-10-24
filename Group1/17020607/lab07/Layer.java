/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.util.ArrayList;

public class Layer {

    protected ArrayList<Shape> shape;
    protected boolean visible;

    public Layer() {
        shape = new ArrayList<>();
        visible = true;
    }

    public void addShape(Shape s) {
        this.shape.add(s);
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void deleteAllTriangle() {
        for (int i = 0; i < shape.size(); ++i) {
            if (shape.get(i) instanceof Triangle) {
                shape.remove(i);
                --i;
            }
        }
    }

    public void deleteAllCircle() {
        for (int i = 0; i < shape.size(); ++i) {
            if (shape.get(i) instanceof Circle) {
                shape.remove(i);
                --i;
            }
        }
    }

    public void printShape() {
        for (int i = 0; i < shape.size(); ++i) {
            System.out.println(shape.get(i).toString());
        }
    }

    void fillRect(int x, int y, int i, int i0) {
        throw new UnsupportedOperationException("Not yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
