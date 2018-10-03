package lab03;

public class oto {
	private String hang,mau,soghe;
	
	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public String getSoghe() {
		return soghe;
	}

	public void setSoghe(String soghe) {
		this.soghe = soghe;
	}

	public void getInfo() {
		System.out.println("No thuoc hang: " + getHang());
		System.out.println("No co mau: " + getMau());
		System.out.println("So ghe ngoi tren xe la : " + getSoghe());
	}
}
