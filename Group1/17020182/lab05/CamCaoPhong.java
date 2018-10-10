package lab5;

public class CamCaoPhong extends QuaCam {
	private String XuatXu;

	public String getXuatXu() {
		return XuatXu;
	}

	public void setXuatXu(String xuatXu) {
		XuatXu = xuatXu;
	}

	public CamCaoPhong(int giaban, Boolean nguanGoc, double soLuong, String mua, String mauSac, String xuatXu) {
		super(giaban, nguanGoc, soLuong, mua, mauSac);
		XuatXu = xuatXu;
	}

	
	
	
}
