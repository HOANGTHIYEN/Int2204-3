package JavaWeek5;

public class Main01 {

	public static void main(String[] args) {
		System.out.println("\n\tTHÔNG TIN CÁC LOẠI HOA QUẢ Ở VIỆT NAM\n");
		System.out.println("-------------------------------------------------------------\n");
		
		Ex1_CamSanh camSanh1 = new Ex1_CamSanh();
		camSanh1.setGiaBan("50 nghìn 1 cân");
		camSanh1.setNgayNhap("Ngày mùng 1 tháng 10 năm 2018");
		camSanh1.setNguocGoc("Trung Hoa");
		camSanh1.setSoLuong("500 Cân");
		camSanh1.thongTinQuaCam(); // in class QuaCam
		camSanh1.thongTinCamSanh(); // in class CamSanh
		
		System.out.println("-------------------------------------------------------------\n");
		
		Ex1_CamCaoPhong camCaoPhong1 = new Ex1_CamCaoPhong();
		camCaoPhong1.setGiaBan("80 nghìn 1 cân");
		camCaoPhong1.setNgayNhap("Ngày mùng 2 tháng 10 năm 2018");
		camCaoPhong1.setNguocGoc("Việt Nam");
		camCaoPhong1.setSoLuong("5000 Cân");
		camCaoPhong1.thongTinQuaCam(); // in class QuaCam
		camCaoPhong1.thongTinCamCaoPhong(); // in class CamCaoPhong
		
		System.out.println("-------------------------------------------------------------\n");
		
		Ex1_QuaTao quaTao1 = new Ex1_QuaTao();
		quaTao1.setGiaBan("50 nghìn 5 cân");
		quaTao1.setNgayNhap("Ngày mùng 5 tháng 10 năm 2018");
		quaTao1.setNguocGoc("Thái Lan");
		quaTao1.setSoLuong("500 Cân");
		quaTao1.thongTinQuaTao(); // in class QuaTao
	}

}
