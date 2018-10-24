/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.Vector;

/**
 *
 * @author MANH HOANG
 */
public class Layer extends Vector <Shape>{
    
    private boolean visible;
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

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void deletesameobject(){
        for (int i = 0; i<this.size()-1;i++)
            for(int j=i+1;j<this.size();j++)
            {
                if(this.get(i) instanceof Rectangle && this.get(j) instanceof  Rectangle
                        &&((Rectangle) this.get(i)).getLength() == ((Rectangle) this.get(j)).getLength()
                        &&((Rectangle) this.get(i)).getWidth() == ((Rectangle) this.get(j)).getWidth()
                        &&((Rectangle) this.get(i)).getVitri() == ((Rectangle) this.get(j)).getVitri())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Square && this.get(j) instanceof  Square
                        &&((Square) this.get(i)).getSize() == ((Square) this.get(j)).getSize()
                        &&((Square) this.get(i)).getVitri() == ((Square) this.get(j)).getVitri())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Triangle && this.get(j) instanceof  Triangle
                        &&((Triangle) this.get(i)).getC1() == ((Triangle) this.get(j)).getC1()
                        &&((Triangle) this.get(i)).getC2() == ((Triangle) this.get(j)).getC2()
                        &&((Triangle) this.get(i)).getC3() == ((Triangle) this.get(j)).getC3()
                        &&((Triangle) this.get(i)).getVitri() == ((Triangle) this.get(j)).getVitri())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Circle && this.get(j) instanceof  Circle
                        &&((Circle) this.get(i)).getRadius() == ((Circle) this.get(j)).getRadius()
                        &&((Circle) this.get(i)).getVitri() == ((Circle) this.get(j)).getVitri())
                {
                    remove(this.get(j));
                    j--;
                }
                if(this.get(i) instanceof Hexagon && this.get(j) instanceof  Hexagon
                        &&((Hexagon) this.get(i)).getWide() == ((Hexagon) this.get(j)).getWide()
                        &&((Hexagon) this.get(i)).getVitri() == ((Hexagon) this.get(j)).getVitri())
                {
                    remove(this.get(j));
                    j--;
                }
            }
    }
}
