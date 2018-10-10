package lab05;

public class QuaTao extends HoaQua {
	public void thongTin(int gia, String ngayNhap, String nguonGoc, int soLuong) {
		this.setGia(gia);
		this.setNgayNhap(ngayNhap);
		this.setNguonGoc(nguonGoc);
		this.setSoLuong(soLuong);
		System.out.println("Thong tin ve tao : ");
		System.out.println("Gia ban/kg: " + getGia());
		System.out.println("Nguon goc: " + getNguonGoc());
		System.out.println("Ngay nhap: " + getNgayNhap());
		System.out.println("So luong: " + getSoLuong() + "kg");
	}
}
