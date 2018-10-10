package tuan5;

public class HoaQua {
    private String NguonGoc;
    private String NgayNhap;
    private String SoLuong;
    private String GiaBan;
	public String getNguonGoc() {
		return NguonGoc;
	}
	public void setNguonGoc(String nguonGoc) {
		NguonGoc = nguonGoc;
	}
	public String getNgayNhap() {
		return NgayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		NgayNhap = ngayNhap;
	}
	public String getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(String soLuong) {
		SoLuong = soLuong;
	}
	public String getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(String giaBan) {
		GiaBan = giaBan;
	}
	public HoaQua(String nguonGoc, String ngayNhap, String soLuong, String giaBan) {
		
		this.NguonGoc = nguonGoc;
		this.NgayNhap = ngayNhap;
		this.SoLuong = soLuong;
		this.GiaBan = giaBan;
	}
	public HoaQua() {
		this.NguonGoc = "";
		this.NgayNhap = "";
		this.SoLuong = "";
		this.GiaBan = "";
	}
	public void HoaQua() {
		System.out.print( "Nguồn gốc:"+this.NguonGoc+"\n Ngày nhập:"+this.NgayNhap+"\n Số lượng:"+this.SoLuong+"\n giá bán:"+this.GiaBan+"\n");
	}
				
}
