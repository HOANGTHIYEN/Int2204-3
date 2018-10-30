import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.shape.*;

public class Main extends Application {

    public void start(Stage primaryStage){
        primaryStage.setTitle("Lab07");
        Group group = new Group();

        Circle circle1 = new Circle(20, "Blue", new Point(200, 200));
        Circle circle2 = new Circle(50, "Black", new Point(100, 200));
        Rectangle rectangle1 = new Rectangle(100, 200, "Pink", new Point(0, 0));
        Rectangle rectangle2 = new Rectangle(120, 240, "Brown", new Point(300, 300));
        Square square = new Square(50, "Orange", new Point(150, 150));
        Triangle triangle1 = new Triangle(new Point(20, 20), new Point(30, 50), new Point(20, 50), "Red");
        Triangle triangle2 = new Triangle(new Point(20, 20), new Point(30, 50), new Point(20, 50), "Red");
        Hexagon hexagon = new Hexagon(20.0, new Point(250, 250), "Yellow");

        for (ArrayList<Shape> elementLayer : diagram){
            for (Shape elementShape : elementLayer ) {
                if (elementShape instanceof Circle){
                    Circle circle3 = new Circle(((Circle) elementShape).radius);
                    group.getChildren().add(circle3);

                }
                if (elementShape instanceof Triangle){
                    Polygon triangle3 = new Polygon();
                    group.getChildren().add(triangle3);
                }
                if (elementShape instanceof Rectangle){
                    Rectangle rectangle3 = new Rectangle(((Rectangle) elementShape).width, ((Rectangle) elementShape).length);
                    group.getChildren().add(rectangle3);
                }
                if (elementShape instanceof Hexagon){
                    Polygon hexagon2 = new Polygon(((Hexagon) elementShape).points);
                    group.getChildren().add(hexagon2);
                }

            }

        }
        Scene scene = new Scene(group,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();

        ArrayList <Layer> layers = new ArrayList<>();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        layers.add(layer1);
        layers.add(layer2);

        Diagram <Shape> diagram = new Diagram();

        hexagon.movingToNewLocation(new Point(50, 50));

        layer1.add(circle1);
        layer1.add(circle2);
        layer1.add(rectangle1);
        layer1.add(square);
        layer2.add(rectangle2);
        layer2.add(triangle1);
        layer2.add(triangle2);
        layer2.add(hexagon);

        layer1.setVisible(true);
        layer2.setVisible(false);

        layer1.deleteSameObjectInSameLayer();
        layer2.deleteSameObjectInSameLayer();

        diagram.sortSameObjectInLayer();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
