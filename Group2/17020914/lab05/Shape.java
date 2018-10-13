/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author admin
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        this.color = "red";
        this.filled = true;        
    }
    public Shape(String n, boolean i){
        this.color = n;
        this.filled = i;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String n){
        this.color = n;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean i){
        this.filled = i;
    }
    @Override
    public String toString() {
        return color+" "+filled;
    }

}
