package quest3;

public class phone {
    private String ten,ma,ram,manhinh,sim,sdt,user,gia,ngaymua,baohanh;

	public phone(String ten, String ma, String ram, String manhinh, String sim, String sdt, String user, String gia,
			String ngaymua, String baohanh) {
		super();
		this.ten = ten;
		this.ma = ma;
		this.ram = ram;
		this.manhinh = manhinh;
		this.sim = sim;
		this.sdt = sdt;
		this.user = user;
		this.gia = gia;
		this.ngaymua = ngaymua;
		this.baohanh = baohanh;
	}
public void Info()
{
	System.out.println("---Phone---");
	System.out.println("Tên: "+ten);
	System.out.println("Ram : "+ram);
	System.out.println("Màn hình : "+manhinh);
	System.out.println("Sim : "+sim);
	System.out.println("Số điện thoại : "+sdt);
	System.out.println("Người sử dụng : "+user);
	System.out.println("Bảo hành : "+baohanh);
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

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
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
