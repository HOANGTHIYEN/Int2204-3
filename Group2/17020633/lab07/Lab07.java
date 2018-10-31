/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
public class Lab07 {
 
   @Override
    public void start(Stage primaryStage) {
        ArrayList<Layer> layer = new ArrayList<>();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        layer.add(layer1);
        layer.add(layer2);
        Diagram<Shape> diagram = new Diagram();
        Circle  circle  = new Circle(new toado(200, 150), 70,Color.CORAL);
        Circle  circle 2 = new Circle (new toado(300, 100), 70,Color.CHOCOLATE);
                                                
         
        toado newLocation = new toado(300, 100);
        circle .moved(newLocation);
         //them doi tuong vao cac layer
        layer1.add(circle );
        layer1.add(circle t2);
        layer1.add(new Circle (new toado(100, 100), 50,Color.BLACK));
        layer2.add(new Triangle (new toado(200, 200), new toado(300, 200), new toado(300, 300),Color.PINK));
        layer1.add(new Square (new toado(400, 200),50,Color.YELLOW));
        layer2.add(new Square (new toado(450, 150),50,Color.BROWN));
        layer2.add(new Hexagon (new toado(100, 300), 50, Color. PINK));
        
        
        layer1.setVisible(true);
        layer2.setVisible(true);
        
        layer1.deleteSame ();
         
        
         
        for (int i=0;i<layer.size();i++){
            if (layer.get(i).visible==true){
                diagram.add(layer.get(i));
            }
        }
        
        diagram.sortObject();
        
  
        primaryStage.setTitle("Lab 06");
        Group group = new Group();
        
        
         for (ArrayList<Shape> elementLayer : diagram){
            for (Shape elementShape : elementLayer ) {
            if (elementShape instanceof Circle ){
                
               
                Circle circle = new Circle(((Circle ) elementShape).tam.x, ((Circle ) elementShape).tam.y, ((Circle ) elementShape).radius, ((Circle ) elementShape).color);
                group.getChildren().add(circle);
                
            }
            if (elementShape instanceof Triangle ){
                
                //ve tam gia bang toa do 3 dinh
                Polygon triangle = new Polygon( ((Triangle ) elementShape).point);
                triangle.setFill(((Triangle ) elementShape).color);
                group.getChildren().add(triangle);
            }
            if (elementShape instanceof Rectangle ){
                
                //ve hinh chu nhat bang tam va chieu dai chieu rong
                Rectangle rectangle = new Rectangle(((Rectangle ) elementShape).chieudai, ((Rectangle ) elementShape).chiẻuong,((Rectangle ) elementShape).color);
                rectangle.setLayoutX(((Rectangle ) elementShape).tam.x-((Rectangle) elementShape).chieudai/2);
                rectangle.setLayoutY(((Rectangle ) elementShape).tam.y-((Rectangle ) elementShape).chieurong/2);
                group.getChildren().addAll(rectangle);
            }
            if (elementShape instanceof Hexagon ){
                Polygon hexagon = new Polygon(((Hexagon t) elementShape).point);
                hexagon.setFill(((Hexagon )elementShape).color);
                group.getChildren().add(hexagon);
            }
        
    }
        
        }
        
        Scene scene = new Scene(group,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
