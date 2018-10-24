/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.Iterator;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
/**
 *
 * @author Hoangson
 */
public class Lab06 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Layer layer1 = new Layer();
        Diagram diagram = new Diagram();
        diagram.add(layer1);
        CircleObject circleObject = new CircleObject(new XYlocation(200, 150), 70);
                        
        //di chuyen vat the
        XYlocation newLocation = new XYlocation(300, 100);
        circleObject.moving(newLocation);
        
        //khoi tao cac object
        layer1.add(circleObject);
        layer1.add(new CircleObject(new XYlocation(100, 100), 50,Color.AQUA));
        layer1.add(new TriangleObject(new XYlocation(200, 200), new XYlocation(300, 200), new XYlocation(300, 300),Color.BLUE));
        layer1.add(new SquareObject(new XYlocation(400, 200),50,Color.YELLOW));
        
        
        //ve cac hinh
        primaryStage.setTitle("Lab 06");
        Group group = new Group();
        
        //lenh xoa object
        //diagram.deleteCircleObject();
        //layer1.deleteTriangleObject();
        
        
        for (Iterator it = layer1.iterator(); it.hasNext();) {
            Object elementShape = it.next();
            if (elementShape instanceof CircleObject){
                
                //ve hinh tron bang tam va ban kinh
                Circle circle = new Circle(((CircleObject) elementShape).center.x, ((CircleObject) elementShape).center.y, ((CircleObject) elementShape).radius, ((CircleObject) elementShape).color);
                group.getChildren().add(circle);
                
            }
            if (elementShape instanceof TriangleObject){
                
                //ve tam gia bang toa do 3 dinh
                Polygon triangle = new Polygon( ((TriangleObject) elementShape).vertice1.x,((TriangleObject) elementShape).vertice1.y,
                        ((TriangleObject) elementShape).vertice2.x,((TriangleObject) elementShape).vertice2.y,
                        ((TriangleObject) elementShape).vertice3.x,((TriangleObject) elementShape).vertice3.y);
                triangle.setFill(((TriangleObject) elementShape).color);
                group.getChildren().add(triangle);
            }
            if (elementShape instanceof RectangleObject){
                
                //ve hinh chu nhat bang tam va chieu dai chieu rong
                Rectangle rectangle = new Rectangle(((RectangleObject) elementShape).length, ((RectangleObject) elementShape).width,((RectangleObject) elementShape).color);
                rectangle.setLayoutX(((RectangleObject) elementShape).center.x-((RectangleObject) elementShape).length/2);
                rectangle.setLayoutY(((RectangleObject) elementShape).center.y-((RectangleObject) elementShape).width/2);
                group.getChildren().addAll(rectangle);
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
