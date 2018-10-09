package lab5;

public class CamSanh extends QuaCam {
	private int CanNang;

	public int getCanNang() {
		return CanNang;
	}

	public void setCanNang(int canNang) {
		CanNang = canNang;
	}

	public CamSanh(int giaban, Boolean nguanGoc, double soLuong, String mua, String mauSac, int canNang) {
		super(giaban, nguanGoc, soLuong, mua, mauSac);
		CanNang = canNang;
	}
	
	public CamSanh()
	{
		super(0, true, 0, "Mùa đông","Màu Vang");
		this.CanNang = 2;
	}
	@Override
	public String toString(){
		return "Giá Bán : "+this.getGiaban() + ",\tMùa :" + this.getMua() + ",\tMàu sắc : " +this.getMauSac() +",\tCân nặng : "+ this.getCanNang();
	}
}
