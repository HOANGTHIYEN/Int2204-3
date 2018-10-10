package lab05;

public class QuaCam extends HoaQua{
	private String mauSac;
	public void thongTin(int gia, String ngayNhap, String nguonGoc, int soLuong) {
		this.setGia(gia);
		this.setNgayNhap(ngayNhap);
		this.setNguonGoc(nguonGoc);
		this.setSoLuong(soLuong);
		System.out.println("Thong tin ve cam nhap khau: ");
		System.out.println("Gia ban/kg: " + getGia());
		System.out.println("Nguon goc: " + getNguonGoc());
		System.out.println("Ngay nhap: " + getNgayNhap());
		System.out.println("So luong: " + getSoLuong() + "kg");
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	
}
