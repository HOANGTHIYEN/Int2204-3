package lab5;

public class QuaTao extends QuaCam {
	private String KichThuoc;

	public String getKichThuoc() {
		return KichThuoc;
	}

	public void setKichThuoc(String kichThuoc) {
		KichThuoc = kichThuoc;
	}
	
	public QuaTao(int giaban, Boolean nguanGoc, double soLuong, String mua, String mauSac, String kichThuoc) {
		super(giaban, nguanGoc, soLuong, mua, mauSac);
		KichThuoc = kichThuoc;
	}

	public QuaTao()
	{
		super(0, true, 0, "Mùa Hè","Màu Đỏ");
		this.KichThuoc="Nhỏ";
	}
	
	@Override
	public String toString()
	{
		return "Giá bán : " + this.getGiaban() + ", Mùa : "+ this.getMua() + ", Màu sắc :" + this.getMauSac() + ", Kích thước :" + getKichThuoc();
	}
	
}
