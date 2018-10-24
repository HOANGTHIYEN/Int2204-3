package lap6;

import java.util.Vector;

@SuppressWarnings("serial")
class Diagram extends Vector<Layer> {

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void removeCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
    public void sort(){
        Layer layer_circle = new Layer();
        Layer layer_triangle = new Layer();
        Layer layer_rectangle = new Layer();
        Layer layer_hexagon = new Layer();
        Layer layer_ = new Layer();
        for (int j=0;j<this.size();j++) {
            Vector<Shape> element = this.get(j);
            for (int i=0;i<element.size();i++){
                if (element.get(i) instanceof Cricle)
                    layer_circle.add(element.get(i));
                if (element.get(i) instanceof Triangle)
                    layer_triangle.add(element.get(i));
                if (element.get(i) instanceof Rectangle)
                    layer_rectangle.add(element.get(i));
                if (element.get(i) instanceof Hexagon)
                    layer_hexagon.add(element.get(i));
            }
            this.remove(j);
            j--;
        }
        this.add(layer_circle);
        this.add(layer_rectangle);
        this.add(layer_triangle);
        this.add(layer_hexagon);
    }
}
