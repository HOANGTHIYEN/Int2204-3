package lab03;

public class bodoi {
	private String ten,donvi,quequan;
	private int tuoi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDonvi() {
		return donvi;
	}
	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
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
		System.out.println("Que huong cua toi la: " + getQuequan());
		System.out.println("Toi thuoc don vi: " + getDonvi());
	}
}
