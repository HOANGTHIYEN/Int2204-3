package lab03;

public class xemay {
	private String hang,mau,phankhoi;

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

	public String getPhankhoi() {
		return phankhoi;
	}

	public void setPhankhoi(String phankhoi) {
		this.phankhoi = phankhoi;
	}
	public void getInfo() {
		System.out.println("No thuoc hang: " + getHang());
		System.out.println("No co mau: " + getMau());
		System.out.println("Phan khoi cua xe la : " + getPhankhoi());
	}
}
