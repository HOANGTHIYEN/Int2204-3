/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b1;

public class Quatao extends Hoaqua {
	String Loaitao;

	public String getLoaitao() {
		return Loaitao;
	}

	public void setLoaitao(String loaitao) {
		Loaitao = loaitao;
	}
	public void Infor() {
		super.Infor();
		System.out.println("Loai tao:"+this.getLoaitao());
	}
}
