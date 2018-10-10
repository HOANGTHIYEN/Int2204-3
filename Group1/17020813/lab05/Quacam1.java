/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b1;

public class Quacam1 extends Quacam {
	String mau;
	public String getmau() {
		return mau;
	}
	public void setmau(String mau) {
		this.mau  = mau;
	}
	public void Infor() {
		super.Infor();
		System.out.println("Mau:"+this.getmau());
	}
}
