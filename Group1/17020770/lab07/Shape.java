/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

public class Shape {
    String color;
    boolean filled;
    Location mid;
    Shape(){
        color = "read";
        filled = true;
    }
    public Shape(String color, boolean filled, Location mid) {
        this.color = color;
        this.filled = filled;
        this.mid = mid;
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
    public Location getTam() {
        return mid;
    }
    public void setTam(Location tam) {
        this.mid = tam;
    }
    public void Move ( double size, String direction){
        switch (direction) {
            case "North":
                mid.setY(mid.getY() + size);
                break;
            case "South":
                mid.setY(mid.getY() - size);
                break;
            case "East":
                mid.setX(mid.getX() + size);
                break;
            case "West":
                mid.setX(mid.getX() - size);
                break;
            default:
                break;
        }
    }

    public void showInfo() {
        System.out.println("Hình" + "\n" + color + "\n" + filled + "\n"+ mid.getX() + "\n"+mid.getY());
    }
}