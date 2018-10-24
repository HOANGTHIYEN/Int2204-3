/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_06;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Layer> layer = new ArrayList<>();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        layer.add(layer1);
        layer.add(layer2);
        Diagram<Shape> diagram = new Diagram();
        CircleObject circleObject = new CircleObject(new XYlocation(200, 150), 80,Color.BLACK);
        CircleObject circleObject2 = new CircleObject(new XYlocation(300, 100), 70,Color.CHOCOLATE);
                                                
        //di chuyen vat the
        XYlocation newLocation = new XYlocation(400, 500);
        circleObject.moving(newLocation);

        //them doi tuong vao cac layer
        layer1.add(circleObject);
        layer1.add(circleObject2);
        layer1.add(new CircleObject(new XYlocation(100, 100), 50,Color.BEIGE));
        layer2.add(new TriangleObject(new XYlocation(200, 200), new XYlocation(300, 200), new XYlocation(300, 300),Color.BLUE));
        layer1.add(new SquareObject(new XYlocation(400, 200),100,Color.RED));
        layer2.add(new SquareObject(new XYlocation(450, 150),50,Color.BROWN));
        layer2.add(new HexagonObject(new XYlocation(100, 300), 50, Color.YELLOW));
        //dat visible cac layer la true
        layer1.setVisible(true);
        layer2.setVisible(true);
        
//       layer1.removeDuplicateObject();
//        layer.get(1).deleteTriangleObject();
        
        //them doi tuong vao diagram
        for (int i=0;i<layer.size();i++){
            if (layer.get(i).visible==true){
                diagram.add(layer.get(i));
            }
        }
        
        diagram.sortObject();
        
        //ve cac hinh
        primaryStage.setTitle("Lab 07");
        Group group = new Group();
        
        //diagram.deleteCircleObject();

        for (ArrayList<Shape> elementLayer : diagram){
            for (Shape elementShape : elementLayer ) {
            if (elementShape instanceof CircleObject){
                
                //ve hinh tron bang tam va ban kinh
                Circle circle = new Circle(((CircleObject) elementShape).center.x, ((CircleObject) elementShape).center.y, ((CircleObject) elementShape).radius, ((CircleObject) elementShape).color);
                group.getChildren().add(circle);
                
            }
            if (elementShape instanceof TriangleObject){
                
                //ve tam gia bang toa do 3 dinh
                Polygon triangle = new Polygon( ((TriangleObject) elementShape).top);
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
            if (elementShape instanceof HexagonObject){
                Polygon hexagon = new Polygon(((HexagonObject) elementShape).top);
                hexagon.setFill(((HexagonObject)elementShape).color);
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
