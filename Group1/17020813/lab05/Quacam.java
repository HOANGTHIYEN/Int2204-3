/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b1;

public class Quacam extends Hoaqua {
	String Loaicam;

	public String getLoaicam() {
		return Loaicam;
	}

	public void setLoaicam(String loaicam) {
		Loaicam = loaicam;
	}
	public void Infor() {
		super.Infor();
		System.out.println("Loai cam :"+this.getLoaicam());
	}
}
