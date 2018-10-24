package lap6;

import java.util.Vector;

@SuppressWarnings("serial")
class Layer extends Vector <Shape> {
    protected Boolean visible=true;

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }
    public void removeTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
    public Boolean Check(int[] x1,int[] x2,int [] y1,int[] y2){
        if(x1.length!= x2.length||y1.length!=y2.length||x1.length!=y1.length) return false;
        for(int i=0;i<x1.length;i++){
            if(x1[i]!=x2[i]||y1[i]!=y2[i]) return false;
        }
        return true;
    }
    void removesame() {
        for (int i = 0; i < this.size() - 1; i++) {
            for (int j = i + 1; j < this.size(); j++) {
                if (this.get(i) instanceof Cricle) {
                    if (this.get(j) instanceof Cricle) {
                        Cricle cricle=(Cricle) this.get(i);
                        Cricle cricle1=(Cricle) this.get(j);
                        if (cricle.radius==cricle1.radius&&Check(cricle.x,cricle1.x,cricle.y,cricle1.y)) {
                            this.remove(j);
                            j--;
                        }
                    }
                }
                if (this.get(i) instanceof Triangle) {
                    if (this.get(j) instanceof Triangle) {
                        Triangle triangle=(Triangle) this.get(i);
                        Triangle triangle1=(Triangle) this.get(j);
                        if (Check(triangle.x,triangle1.x,triangle.y,triangle1.y)) {
                            this.remove(j);
                            j--;
                        }
                    }
                }
                if (this.get(i) instanceof Rectangle) {
                    if (this.get(j) instanceof Rectangle) {
                        Rectangle rectangle=(Rectangle) this.get(i);
                        Rectangle rectangle1=(Rectangle) this.get(j);
                        if (Check(rectangle.x,rectangle1.x,rectangle.y,rectangle1.y)) {
                            this.remove(j);
                            j--;
                        }
                    }
                }
                if (this.get(i) instanceof Hexagon) {
                    if (this.get(j) instanceof Hexagon) {
                        Hexagon hexagon=(Hexagon) this.get(i);
                        Hexagon hexagon1=(Hexagon) this.get(j);

                        if (Check(hexagon.x,hexagon1.x,hexagon.y,hexagon1.y)) {
                            this.remove(j);
                            j--;
                        }
                    }
            }


        }
    }

}
}
