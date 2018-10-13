package com.lab05.bai01;

public class HoaQua {
	protected String ten;

	//private String mausac;
	
	protected int giaban;
	
	public  String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getGiaban() {
		return giaban;
	}
	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}
	public HoaQua(String ten,int giaban) {
		this.ten=ten;
		this.giaban=giaban;
	}
	public String  getInfo() {
		return "ten cua qua la: "+ten+"\ngia ban cua qua la: "+giaban;
	}
}
