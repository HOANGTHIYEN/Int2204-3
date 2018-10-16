/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b1;

public class Hoaqua {
	int giaban;
	String nguongoc;
	String ngaynhap;
	int soluong;
	public int getGiaban() {
		return giaban;
	}
	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}
	public String getNguongoc() {
		return nguongoc;
	}
	public void setNguongoc(String nguongoc) {
		this.nguongoc = nguongoc;
	}
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public void Infor(){
		System.out.println("giaban :"+this.getGiaban());
		System.out.println("nguongoc :"+this.getNguongoc());
		System.out.println("ngaynhap :"+this.getNgaynhap());
		System.out.println("soluong  :"+this.getSoluong());
	}
}
