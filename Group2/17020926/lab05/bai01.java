package lab05;

public class bai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuaCam qc = new QuaCam();
		qc.thongTin(16000, "12/10/2018", "Trung Quoc", 1600);
		System.out.println("------------------");
		CamCaoPhong ccp = new CamCaoPhong();
		ccp.thongTin(30000, "13/10/2018", "Tuyen Quang", 1000,"Vang cam");
		System.out.println("------------------");
		CamSanh cs = new CamSanh();
		cs.thongTin(45000, "09/11/2018", "Bac Giang", 14000, "Xanh luc");
		System.out.println("------------------");
		QuaTao qt = new QuaTao();
		qt.thongTin(20000, "14/12/2018", "Viet Nam", 12000);
		
	}

}
