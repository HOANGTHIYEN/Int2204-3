/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package câu.pkg2.lab05;

/**
 *
 * @author Administrator
 */
public class Shape {
    public
    String color; //màu
    boolean filled; // đày

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Shape()
    {   this.color="red";
        this.filled=true;
    }
    public Shape(String color ,boolean filled)
    {   this.color=color;
        this.filled=filled;
    }
    @Override
    public String toString() {
        return "Màu là : " + getColor()+"\t"+"Thì : "+isFilled();
    }
}