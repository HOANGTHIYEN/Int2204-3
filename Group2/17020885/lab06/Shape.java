/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Dell
 */
class Shape {
    
    protected String color;
    protected boolean filled;
    protected Toado tam;
    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled, Toado tam) {
        this.color = color;
        this.filled = filled;
        this.tam = tam;
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

    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }
    public void dichuyen(double dodai, String huong){
        switch (huong) {
            case "len":
                tam.setY(tam.getY() + dodai);
                break;
            case "xuong":
                tam.setY(tam.getY() - dodai);
                break;
            case "trai":
                tam.setX(tam.getX() + dodai);
                break;
            case "phai":
                tam.setX(tam.getX() - dodai);
                break;
            default:
                break;
        }
    }
    public void info(){
        System.out.println("");
    }
}

