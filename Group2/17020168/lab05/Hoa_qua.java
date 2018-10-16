package bai_tap_tuan_5;

public class Hoa_qua {
	int gia_ban;
	String nguon_goc;
	String ngay_nhap;
	int so_luong;
	public int getGia_ban() {
		return gia_ban;
	}
	public void setGia_ban(int gia_ban) {
		this.gia_ban = gia_ban;
	}
	public String getNguon_goc() {
		return nguon_goc;
	}
	public void setNguon_goc(String nguon_goc) {
		this.nguon_goc = nguon_goc;
	}
	public String getNgay_nhap() {
		return ngay_nhap;
	}
	public void setNgay_nhap(String ngay_nhap) {
		this.ngay_nhap = ngay_nhap;
	}
	public int getSo_luong() {
		return so_luong;
	}
	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}
	public void showInfor(){
		System.out.println("gia_ban :"+this.getGia_ban());
		System.out.println("nguon_goc :"+this.getNguon_goc());
		System.out.println("ngay_nhap :"+this.getNgay_nhap());
		System.out.println("so_luong  :"+this.getSo_luong());
	}
}
