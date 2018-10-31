/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Admin
 */
import java.awt.Color;

public class Square extends Rectangle{
	protected int side=1;
	
	public Square() {
		super();
	}
	
	public Square(int side) {
		super(side, side);
	}
	
	public Square(int X, int Y, Color color, boolean isFilled) {
		super(X, Y, color, isFilled);
	}
	
	public Square(int X, int Y, Color color, boolean isFilled, int side) {
		super(X, Y, color, isFilled, side, side);
	}
	
	public void resize(int side) {
		width=side;
		length=side;
	}
	
	@Override
	public void resizeWidth(int side) {
		width=side;
		length=side;
	}
	
	public void resizeHeight(int side) {
		width=side;
		length=side;
	}
	@Override
	public void getInfo() {
		System.out.println("Square:\nside: " + side +"\nColor" + color);
		getPos();
		
	}

}
