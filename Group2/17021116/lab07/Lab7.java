/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

/**
 *
 * @author 123456789
 */
public class Lab7 extends Application{
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Layer> layer = new ArrayList<>();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        layer.add(layer1);
        layer.add(layer2);
        Diagram<Shape> diagram = new Diagram();
        Circle circle = new Circle(new Position(200, 150), 70,Color.CORAL);
        Circle circle2 = new Circle(new Position(300, 100), 70,Color.CHOCOLATE);
                                                
        //Di chuyen vat the
        Position newPosition = new Position(300, 100);
        circle.moving(newPosition);

        //Them doi tuong vao cac layer
        layer1.add(circle);
        layer1.add(circle2);
        layer1.add(new Circle(new Position(100, 100), 50,Color.AQUA));
        layer2.add(new Triangle(new Position(200, 200), new Position(300, 200), new Position(300, 300),Color.BLUE));
        layer1.add(new Square(new Position(400, 200),50,Color.YELLOW));
        layer2.add(new Square(new Position(450, 150),50,Color.BROWN));
        layer2.add(new Hexagon(new Position(100, 300), 50, Color.HOTPINK));
        //Dat visible cac layer la true
        layer1.setVisible(true);
        layer2.setVisible(true);
        
        layer1.deleteSameObject();
        //Layer.get(1).deleteTriangle();
        
        
        for (int i=0;i<layer.size();i++){
            if (layer.get(i).visible==true){
                diagram.add(layer.get(i));
            }
        }
        
        diagram.sortObject();
        
        //ve cac hinh
        primaryStage.setTitle("Lab07");
        Group group = new Group();
        
        //diagram.deleteCircle();
        for (ArrayList<Shape> elementLayer : diagram){
            for (Shape elementShape : elementLayer ) {
                if (elementShape instanceof Circle){
                    //ve hinh tron
                    Circle circle = new Circle(((Circle) elementShape).center.x, ((Circle) elementShape).center.y, ((Circle) elementShape).radius, ((Circle) elementShape).color);
                    group.getChildren().add(circle);
                }
                if (elementShape instanceof Triangle){
                    //ve tam giac
                    Polygon triangle = new Polygon( ((Triangle) elementShape).points);
                    triangle.setFill(((Triangle) elementShape).color);
                    group.getChildren().add(triangle);
                }
                if (elementShape instanceof Rectangle){
                    //ve hinh chu nhat
                    Rectangle rectangle = new Rectangle(((Rectangle) elementShape).length, ((Rectangle) elementShape).width,((Rectangle) elementShape).color);
                    rectangle.setLayoutX(((Rectangle) elementShape).center.x-((Rectangle) elementShape).length/2);
                    rectangle.setLayoutY(((Rectangle) elementShape).center.y-((Rectangle) elementShape).width/2);
                    group.getChildren().addAll(rectangle);
                }
                if (elementShape instanceof Hexagon){
                    Polygon hexagon = new Polygon(((Hexagon) elementShape).points);
                    hexagon.setFill(((Hexagon)elementShape).color);
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
        // TODO code application logic here
        launch(args);
    }
        
}
    

