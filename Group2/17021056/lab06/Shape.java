/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.lab06;

/**
 *
 * @author Administrator
 */
public class Shape {
 protected String color;
    protected boolean filled;
    protected Toado td;
    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled, Toado td) {
        this.color = color;
        this.filled = filled;
        this.td = td;
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

    public Toado getTd() {
        return td;
    }

    public void setTd(Toado td) {
        this.td = td;
    }
    public void dichuyen(double dodai, String huong){
        switch (huong) {
            case "bac":
                td.setY(td.getY() + dodai);
                break;
            case "nam":
                td.setY(td.getY() - dodai);
                break;
            case "dong":
                td.setX(td.getX() + dodai);
                break;
            case "tay":
                td.setX(td.getX() - dodai);
                break;
            default:
                break;
        }
    }
    public void info(){
        System.out.println("");
    }
}

