package quest3;

public class Sinhvien {
   private String maso,ten,truong,lop,ngaynhaphoc,thoihan;

public Sinhvien(String maso, String ten, String truong, String lop, String ngaynhaphoc, String thoihan) {
	super();
	this.maso = maso;
	this.ten = ten;
	this.truong = truong;
	this.lop = lop;
	this.ngaynhaphoc = ngaynhaphoc;
	this.thoihan = thoihan;
}
public void Info()
{
	System.out.println("---Thông tin sinh viên---");
	System.out.println("Mã số Sinh viên : "+maso);
	System.out.println("Tên : "+ten);
	System.out.println("Trường học : "+truong);
	System.out.println("Lớp : "+lop);
	System.out.println("Năm nhập học : "+ngaynhaphoc);
	System.out.println("Thời hạn : "+thoihan);
	System.out.println("");

}
public String getMaso() {
	return maso;
}

public void setMaso(String maso) {
	this.maso = maso;
}

public String getTen() {
	return ten;
}

public void setTen(String ten) {
	this.ten = ten;
}

public String getTruong() {
	return truong;
}

public void setTruong(String truong) {
	this.truong = truong;
}

public String getLop() {
	return lop;
}

public void setLop(String lop) {
	this.lop = lop;
}

public String getNgaynhaphoc() {
	return ngaynhaphoc;
}

public void setNgaynhaphoc(String ngaynhaphoc) {
	this.ngaynhaphoc = ngaynhaphoc;
}

public String getThoihan() {
	return thoihan;
}

public void setThoihan(String thoihan) {
	this.thoihan = thoihan;
}
}
