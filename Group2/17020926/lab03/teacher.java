package lab03;

public class teacher {
	private String ten,monhoc;
	private int tuoi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMonhoc() {
		return monhoc;
	}
	public void setMonhoc(String monhoc) {
		this.monhoc = monhoc;
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
		System.out.println("Mon hoc toi day la: " + getMonhoc());
	}
}
