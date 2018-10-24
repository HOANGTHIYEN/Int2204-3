package Shape;

import java.awt.*;
import java.util.ArrayList;

public class Shape{
    ArrayList<Points> listPoint = new ArrayList<Points>();
    private String color;
    private boolean filled = true;

    public Shape(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, String color) {
        this.color = color;
        listPoint.add(new Points(x1, y1));
        listPoint.add(new Points(x2, y2));
        listPoint.add(new Points(x3, y3));
        listPoint.add(new Points(x4, y4));
    }

    public Shape(int x1, int y1, int x2, int y2, int x3, int y3, String color) {
        this.color = color;
        listPoint.add(new Points(x1, y1));
        listPoint.add(new Points(x2, y2));
        listPoint.add(new Points(x3, y3));
    }

    public Shape(int x1, int y1, String color) {
        this.color = color;
        listPoint.add(new Points(x1, y1));
    }

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

    public void move(int x, int y){
        int length = listPoint.size();

        for(int i=0; i<length; i++){
            listPoint.get(i).setOx(listPoint.get(i).getOx() + x);
            listPoint.get(i).setOy(listPoint.get(i).getOy() + y);
        }
    }
}
