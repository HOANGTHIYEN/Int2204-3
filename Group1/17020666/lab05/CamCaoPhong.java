package com.lab05.bai01;

public class CamCaoPhong extends QuaCam {
	private int soluong;

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public CamCaoPhong(String ten, int giaban,String nguongoc,int soluong) {
		super(ten,giaban,nguongoc);
		this.soluong=soluong;
	}
	public String getInfo() {
		String s;
		s=super.getInfo()+"\nso luong cam cao phong la: "+soluong+" nghin tan";
		return s;
	}
}
