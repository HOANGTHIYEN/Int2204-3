/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap07;

import java.util.Objects;

/**
 *
 * @author Nguyễn Thái
 */
public abstract class Shape {
    String color;
    boolean filled;
    Toadodiem td;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    public Shape(String color,Toadodiem td) {
        this.color = color;
        this.td = td;
    }
     public Shape(String color, boolean filled, Toadodiem td) {
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
     public Toadodiem getTd() {
        return td;
    }
     public void setTd(Toadodiem td) {
        this.td = td;
    }

  public void Xuat(){
        System.out.println("");
    }
    // cac hinh giong nhau
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shape other = (Shape) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.td, other.td)) {
            return false;
        }
        return true;
    }
    
}
