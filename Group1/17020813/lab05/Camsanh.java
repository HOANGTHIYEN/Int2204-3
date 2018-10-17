/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b1;

public class Camsanh extends Quacam{
	String vi;
	public String getVi() {
		return vi;
	}
	public void setVi(String vi) {
		this.vi = vi;
	}
	public void Infor() {
		super.Infor();
		System.out.println("Vi:"+this.getVi());
	}
}
