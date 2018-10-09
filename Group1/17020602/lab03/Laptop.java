package quest3;

public class Laptop {
  private String ten,ma,intel,ram,manhinh,user,gia,ngaymua,baohanh;

public Laptop(String ten, String ma, String intel, String ram, String manhinh, String user, String gia, String ngaymua,
		String baohanh) {
	this.ten = ten;
	this.ma = ma;
	this.intel = intel;
	this.ram = ram;
	this.manhinh = manhinh;
	this.user = user;
	this.gia = gia;
	this.ngaymua = ngaymua;
	this.baohanh = baohanh;
}
public void Info()
{
	System.out.println("---Laptop---");
	System.out.println("Tên : "+ten);
	System.out.println("Mã : "+ma);
	System.out.println("Intel : "+intel);
	System.out.println("Ram : "+ram);
	System.out.println("Màn hình : "+manhinh);
	System.out.println("Người sử dụng: "+user);
	System.out.println("Bảo hành: "+baohanh);
	System.out.println("");
}
public String getTen() {
	return ten;
}

public void setTen(String ten) {
	this.ten = ten;
}

public String getMa() {
	return ma;
}

public void setMa(String ma) {
	this.ma = ma;
}

public String getIntel() {
	return intel;
}

public void setIntel(String intel) {
	this.intel = intel;
}

public String getRam() {
	return ram;
}

public void setRam(String ram) {
	this.ram = ram;
}

public String getManhinh() {
	return manhinh;
}

public void setManhinh(String manhinh) {
	this.manhinh = manhinh;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getGia() {
	return gia;
}

public void setGia(String gia) {
	this.gia = gia;
}

public String getNgaymua() {
	return ngaymua;
}

public void setNgaymua(String ngaymua) {
	this.ngaymua = ngaymua;
}

public String getBaohanh() {
	return baohanh;
}

public void setBaohanh(String baohanh) {
	this.baohanh = baohanh;
}
}
