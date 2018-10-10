package lab5;

public class QuaCam extends HoaQua {
	
	private String MauSac;
	
	public String getMauSac() {
		return MauSac;
	}
	public void setMauSac(String mauSac) {
		MauSac = mauSac;
	}
	//constructor
	public QuaCam(int giaban, Boolean nguanGoc, double soLuong, String mua, String mauSac) {
		super(giaban, nguanGoc, soLuong, mua);
		MauSac = mauSac;
	}
	
	
	//constructor
	public QuaCam()
	{
		super(0,false,0,"null");
		this.MauSac="mau cam";
	}
	
	
}
