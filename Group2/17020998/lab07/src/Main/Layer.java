package Main;

import java.util.ArrayList;

public class Layer{
    protected ArrayList<Shape> shapes;

    private String name;

    private int index;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    private boolean visible;

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public Layer(){
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


    public void addCircle(Shape Circle){
        int size = shapes.size();
        System.out.println(size);
        Circle.setIndex(size);
        shapes.add(Circle);

    }

    public void addRectangle(Shape Rectangle){
        int size = shapes.size();
        Rectangle.setIndex(size);
        shapes.add(Rectangle);

    }

    public void addSquare(Shape Square){
        int size = shapes.size();Square.setIndex(size);
        shapes.add(Square);
    }

    public void addTriangle(Shape Triangle){

        int size = shapes.size();
        Triangle.setIndex(size);
        shapes.add(Triangle);

    }

    public void addHexagon(Shape Hexagon){

        int size = shapes.size();
        Hexagon.setIndex(size);
        shapes.add(Hexagon);

    }

    public Shape getShape(int index){
        return shapes.get(index);
    }

    public boolean deleteAllTriangle(){

        for(int i = 0; i<shapes.size(); i++){
            if(shapes.get(i) instanceof Triangle){
                shapes.remove(i);
                i--;
            }
        }

        return true;
    }

    public void Draw(){
        System.out.println("draw all shape in layer + " + this.name);
    }

    public void deleteSameShape(){
        ArrayList<Shape> newShape = new ArrayList<>();
        for(int i = 0; i<shapes.size(); i++){
            if(!newShape.contains(shapes.get(i))){
                newShape.add(shapes.get(i));
                System.out.println("done");

            }
        }
        shapes = newShape;
        System.out.println("done");
    }

    public boolean deleteAllCircle(){

        for(int i = 0; i<shapes.size(); i++){
            if(shapes.get(i) instanceof Circle){
                shapes.remove(i);
                i--;
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

}
