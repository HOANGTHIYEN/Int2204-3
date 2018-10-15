import java.util.ArrayList;

public class Layer {
    protected ArrayList<Shape> shapes;

    private String name;


    protected int index;

    Layer(){
        shapes = new ArrayList<>();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drawCircle(Shape Circle) {
        int size = shapes.size();
        Circle.setIndex(size);
        shapes.add(Circle);
        Circle.point.draw();
    }
    public void drawRectangle(Shape Rectangle){
        int size = shapes.size();
        Rectangle.setIndex(size);
        shapes.add(Rectangle);
        Rectangle.point.draw();
    }

    public void drawSquare(Shape Square){
        int size = shapes.size();
        Square.setIndex(size);
        shapes.add(Square);
        Square.point.draw();
    }

    public void drawTriangle(Shape Triangle){
        int size = shapes.size();
        Triangle.setIndex(size);
        shapes.add(Triangle);
        Triangle.point.draw();
    }
    public boolean deleteAllCircle(){
        for(int i = 0; i<shapes.size(); i++){
            if(shapes.get(i) instanceof Circle){
                shapes.remove(i);
            }
        }
        for (int i = 0; i<shapes.size(); i++){
            if(shapes.get(i) instanceof Triangle){
                System.out.println("Still have circle");
                return false;
            }
        }
        return true;
    }
    public boolean deleteAllTriangle(){
        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) instanceof Triangle){
                shapes.remove(i);
            }
        }
        for (int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) instanceof Triangle){
                System.out.println("Still have triangle");
                return false;
            }
        }
        return true;
    }
}
