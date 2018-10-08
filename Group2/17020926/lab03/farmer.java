package lab03;

public class farmer {
	private String ten,nongsan;
	private int tuoi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNongsan() {
		return nongsan;
	}
	public void setNongsan(String nongsan) {
		this.nongsan = nongsan;
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
		System.out.println("Toi dang thu hoach: " + getNongsan());
	}
}
