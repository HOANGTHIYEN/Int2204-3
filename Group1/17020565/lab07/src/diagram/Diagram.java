package diagram;

import diagram.layer.Layer;
import diagram.layer.shape.Shape;
import ui.DrawShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Diagram {
    JButton removeTriangle = new JButton("Remove Triangle");
    JFrame jFrame;
    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    protected ArrayList<Layer> listLayer;

    public Diagram() {
        listLayer = new ArrayList<>();
        removeTriangle.addActionListener(e -> {
            removeAllTriangle();
            jFrame.hide();
            printAll();
        });
    }

    public void addShape(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle(){
        ArrayList<Layer> layers = (ArrayList<Layer>) listLayer.clone();
        for(Layer layer : layers){
            layer.removeAllCircle();
        }
    }

    public void removeAllTriangle(){
        ArrayList<Layer> layers = (ArrayList<Layer>) listLayer.clone();
        for(Layer layer : layers){
            layer.removeAllTriangle();
        }
    }

    public void printAll() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());
        for(Layer layer: listLayer){
            for(Shape shape: layer.listShape){
                if(shape.validate()){
                    DrawShape drawShape = new DrawShape(shape);
                    jFrame.add(drawShape);
                }else {
                    System.out.println(shape.toString() + " invalid");
                }
            }
        }

        jFrame.add(removeTriangle);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
