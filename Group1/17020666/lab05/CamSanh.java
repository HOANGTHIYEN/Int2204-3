package com.lab05.bai01;

public class CamSanh extends QuaCam {
	private String mausac;

	public String getMausac() {
		return mausac;
	}

	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public CamSanh(String ten,int giaban,String nguongoc,String mausac) {
		super(ten,giaban,nguongoc);
		this.mausac=mausac;
	}
	public String getInfo() {
		String s;
		s=super.getInfo()+"\nmau sac cam sanh la: "+mausac;
		return s;
	}
}
