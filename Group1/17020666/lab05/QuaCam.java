package com.lab05.bai01;

public class  QuaCam extends HoaQua {
	private String nguongoc;

	public String getNguongoc() {
		return nguongoc;
	}

	public void setNguongoc(String nguongoc) {
		this.nguongoc = nguongoc;
	}
	public QuaCam(String ten,int giaban,String nguongoc) {
		super(ten,giaban);
		this.nguongoc=nguongoc;
	}
	public String getInfo() {
		String s;
		s=super.getInfo()+"\nnguon goc cua cam la: "+nguongoc;
		return s;
	}
}
