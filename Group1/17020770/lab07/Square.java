/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

class Square extends Rectangle{
    protected double side;
    public Square(){

    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }
    public Square(double side, String color, boolean filled, Location mid) {
        super(side, side, color, filled, mid);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    public void showInfo() {
        System.out.println("Hình vuông" + "\n" + side + "\n" + color  + "\n" + filled + "\n" + mid );
    }
}