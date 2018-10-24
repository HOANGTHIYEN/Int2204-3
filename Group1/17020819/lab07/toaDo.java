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
public class toaDo {
	private int X=0,Y=0;
	
	public toaDo(int X, int Y) {
		this.X=X;
		this.Y=Y;
	}
	
	public toaDo() {
	}
	
	
	public void setPos(int x, int y) {
		X=x;
		Y=y;
	}
	
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
}
