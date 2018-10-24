
package Diagram;

import Layer.Layer;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import Shape.*;

public class Diagram extends JPanel{

    public ArrayList<Layer> DiagramLayers = new ArrayList<>();
    JFrame jFrame = new JFrame();
    JPanel jPanel = new JPanel();
    // XOa het cac khoi Circle trong Diagram;
    public void deleteAllCircle(){
        for(int i=0; i< DiagramLayers.size(); i++){
            DiagramLayers.get(i).deleteAllCircle();
        }
    }
    public void deleteAllTriangle(){
        for(int i=0; i< DiagramLayers.size(); i++){
            DiagramLayers.get(i).deleteAllTriangle();
        }
    }

    public void addToDiagram(Layer layer){
        DiagramLayers.add(layer);
    }

    public void drawAll(){
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(1, 1));
        for(int i=0; i< DiagramLayers.size(); i++) {
            if(DiagramLayers.get(i).getVisible().equals("false")){
                continue;
            }
            for (int j = 0; j < DiagramLayers.get(i).LayersList.size(); j++) {
                DrawShape drawShape = new DrawShape(DiagramLayers.get(i).LayersList.get(j));
                jFrame.add(drawShape);
            }
        }
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public void sortShape(){
        Layer layerCircle = new Layer();
        Layer layerRectangle = new Layer();
        Layer layerTriangle = new Layer();
        Layer layerSquare = new Layer();
        for(int i=0; i< DiagramLayers.size(); i++) {
            for (int j = 0; j < DiagramLayers.get(i).LayersList.size(); j++) {
                if(DiagramLayers.get(i).LayersList.get(j) instanceof Circle){
                    layerCircle.addToLayer(DiagramLayers.get(i).LayersList.get(j));
                }
                if(DiagramLayers.get(i).LayersList.get(j) instanceof Shape.Triangle){
                    layerTriangle.addToLayer(DiagramLayers.get(i).LayersList.get(j));
                }
                if(DiagramLayers.get(i).LayersList.get(j) instanceof Shape.Rectangle){
                    layerRectangle.addToLayer(DiagramLayers.get(i).LayersList.get(j));
                }
                if(DiagramLayers.get(i).LayersList.get(j) instanceof Shape.Square){
                    layerSquare.addToLayer(DiagramLayers.get(i).LayersList.get(j));
                }
            }
        }
        for(int i=0; i< DiagramLayers.size(); i++) {
            DiagramLayers.remove(i);
            i--;
        }
        DiagramLayers.add(layerCircle);
        DiagramLayers.add(layerRectangle);
        DiagramLayers.add(layerSquare);
        DiagramLayers.add(layerTriangle);
    }
}
