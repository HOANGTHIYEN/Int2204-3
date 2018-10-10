package lab03;

public class laptop {
	private String hang,hedieuhanh,baohanh;

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public String getHedieuhanh() {
		return hedieuhanh;
	}

	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}

	public String getBaohanh() {
		return baohanh;
	}

	public void setBaohanh(String baohanh) {
		this.baohanh = baohanh;
	}
	public void getInfo() {
		System.out.println("No thuoc hang : " + getHang());
		System.out.println("No su dung he dieu hanh : " + getHedieuhanh());
		System.out.println("Thoi gian bao hanh : " + getBaohanh());
	}
}
