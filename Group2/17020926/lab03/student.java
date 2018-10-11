package lab03;

public class student {
	private String ten,truong;
	private int tuoi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void getInfo() {
		System.out.println("Ten toi la: " + getTen());
		System.out.println("Tuoi cua toi la: " + getTuoi());
		System.out.println("Toi dang hoc tai truong: " + getTruong());
	}
}
