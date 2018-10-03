package lab03;

public class chuot {
	private String loai,noio,thucan;
	
	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getNoio() {
		return noio;
	}

	public void setNoio(String noio) {
		this.noio = noio;
	}

	public String getThucan() {
		return thucan;
	}

	public void setThucan(String thucan) {
		this.thucan = thucan;
	}

	public void getInfo() {
		System.out.println("No thuoc loai: " + getLoai());
		System.out.println("No o: " + getNoio());
		System.out.println("Thuc an cua no la: " + getThucan());
	}
}
