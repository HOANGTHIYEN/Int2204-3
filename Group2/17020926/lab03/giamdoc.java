package lab03;

public class giamdoc {
	private String ten,congty;
	private int tuoi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getCongty() {
		return congty;
	}
	public void setCongty(String congty) {
		this.congty = congty;
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
		System.out.println("Toi dang dieu hanh cong ty: " + getCongty());
	}
}
