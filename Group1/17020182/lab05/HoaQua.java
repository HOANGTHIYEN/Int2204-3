package lab5;

public class HoaQua {
	private int Giaban;
	private Boolean NguanGoc;
	private double SoLuong;
	private String mua;
	
	//get set
	public Boolean getNguanGoc() {
		return NguanGoc;
	}
	public void setNguanGoc(Boolean nguanGoc) {
		NguanGoc = nguanGoc;
	}
	public double getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(double soLuong) {
		SoLuong = soLuong;
	}
	public String getMua() {
		return mua;
	}
	public void setMua(String mua) {
		this.mua = mua;
	}
	public int getGiaban() {
		return Giaban;
	}
	public void setGiaban(int giaban) {
		Giaban = giaban;
	}
	//constructor
	public HoaQua(int giaban, Boolean nguanGoc, double soLuong, String mua) {
		this.Giaban = giaban;
		this.NguanGoc = nguanGoc;
		this.SoLuong = soLuong;
		this.mua = mua;
	}
	
	
	
}
