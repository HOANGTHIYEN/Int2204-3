package Lab07;

import java.util.Vector;

class Layer extends Vector<Shape> {
    boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Layer() {
    }
    public void eraseTriangle(){
        for(int j = this.size()-1;j >=0 ;j--)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
            }
    }
    public void deletesameobject(){
        for (int i = 0; i<this.size()-1;i++)
            for(int j=i+1;j<this.size();j++)
            {
                if(this.get(i) instanceof Rectangle && this.get(j) instanceof  Rectangle
                        &&((Rectangle) this.get(i)).getLength() == ((Rectangle) this.get(j)).getLength()
                        &&((Rectangle) this.get(i)).getWidth() == ((Rectangle) this.get(j)).getWidth()
                        &&((Rectangle) this.get(i)).getTam() == ((Rectangle) this.get(j)).getTam())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Square && this.get(j) instanceof  Square
                        &&((Square) this.get(i)).getSide() == ((Square) this.get(j)).getSide()
                        &&((Square) this.get(i)).getTam() == ((Square) this.get(j)).getTam())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Triangle && this.get(j) instanceof  Triangle
                        &&((Triangle) this.get(i)).getC1() == ((Triangle) this.get(j)).getC1()
                        &&((Triangle) this.get(i)).getC2() == ((Triangle) this.get(j)).getC2()
                        &&((Triangle) this.get(i)).getC3() == ((Triangle) this.get(j)).getC3()
                        &&((Triangle) this.get(i)).getTam() == ((Triangle) this.get(j)).getTam())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Circle && this.get(j) instanceof  Circle
                        &&((Circle) this.get(i)).getRadius() == ((Circle) this.get(j)).getRadius()
                        &&((Circle) this.get(i)).getTam() == ((Circle) this.get(j)).getTam())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Hexagon && this.get(j) instanceof  Hexagon
                        &&((Hexagon) this.get(i)).getWide() == ((Hexagon) this.get(j)).getWide()
                        &&((Hexagon) this.get(i)).getTam() == ((Hexagon) this.get(j)).getTam())
                {
                    remove(this.get(j));
                    j--;
                }
            }
    }
}