package quest3;

public class thuoc {
   private String ten,ma,tien,chuabenh,khongchuaduocbenh,han;

public thuoc(String ten, String ma, String tien, String chuabenh, String khongchuaduocbenh, String han) {
	super();
	this.ten = ten;
	this.ma = ma;
	this.tien = tien;
	this.chuabenh = chuabenh;
	this.khongchuaduocbenh = khongchuaduocbenh;
	this.han = han;
}
public void Info()
{
	System.out.println("---Thuốc---");
	System.out.println("Tên : "+ten);
	System.out.println("Mã sản phẩm : "+ma);
	System.out.println("Giá : "+tien);
	System.out.println("Chữa bệnh : "+chuabenh);
	System.out.println("Hạn sử dụng: "+han);
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

public String getTien() {
	return tien;
}

public void setTien(String tien) {
	this.tien = tien;
}

public String getChuabenh() {
	return chuabenh;
}

public void setChuabenh(String chuabenh) {
	this.chuabenh = chuabenh;
}

public String getKhongchuaduocbenh() {
	return khongchuaduocbenh;
}

public void setKhongchuaduocbenh(String khongchuaduocbenh) {
	this.khongchuaduocbenh = khongchuaduocbenh;
}

public String getHan() {
	return han;
}

public void setHan(String han) {
	this.han = han;
}
}
