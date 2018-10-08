package lab03;

public class hotel {
	private String ten,diachi,giaphong;
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getGiaphong() {
		return giaphong;
	}

	public void setGiaphong(String giaphong) {
		this.giaphong = giaphong;
	}
	public void getInfo() {
		System.out.println("Ten khach san: " + getTen());
		System.out.println("Dia chi: " + getDiachi());
		System.out.println("Gia thue phong o day la: " + getGiaphong());
	}
}
