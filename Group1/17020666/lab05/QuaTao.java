package com.lab05.bai01;

public class QuaTao extends HoaQua {
	private double dientich;

	public double getDientich() {
		return dientich;
	}

	public void setDientich(double  dientich) {
		this.dientich = dientich;
	}
	public QuaTao(String ten,int  giaban,double  dientich) {
		super(ten,giaban);
		this.dientich=dientich;
	}
	public String getInfo() {
		String s;
		s=super.getInfo()+"\ndien tich trong la: "+dientich+" km^2";
		return s;
	}

}
