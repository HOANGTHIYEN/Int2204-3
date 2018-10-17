package commuio.com;

public class Fruit {
	protected String ten ;
	protected String nguonGoc;
	protected double gia ;
	protected String ngayNhap;
	protected int soLuong;
	public Fruit(String ten, String nguonGoc, double gia, String ngayNhap, int soLuong) {
		
		this.ten = ten;
		this.nguonGoc = nguonGoc;
		this.gia = gia;
		this.ngayNhap = ngayNhap;
		this.soLuong = soLuong;
	}
	public Fruit() {
		
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNguonGoc() {
		return nguonGoc;
	}
	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	

}
