/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;


import java.util.ArrayList;

import java.util.List;

public class Layer {
    protected String name;
    protected List<Shape> listShape;
    public Layer(String name) {
        this.listShape = new ArrayList<>();
        this.name = name;
    }public void addShape(Shape shape) {
        this.listShape.add(shape);
    }

    public void removeAllTriangle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
                i--;
            }

        }
    }

    public void removeAllCircle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle) {
                listShape.remove(i);
                i--;
            }
        }
    }
    public void showAllShapes() {
        System.out.println(this);
        for (Shape shape : this.listShape) {
            System.out.println(shape);
        }
    }
    public String toString() {
        return "Layer: " + name;
    }
}
