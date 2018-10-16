package JavaWeek5;

public class Ex1_QuaCam extends Ex1_HoaQua{
	//Thông tin về quả Cam
	public void thongTinQuaCam() {
		System.out.println("Ngày Nhập: " + super.getNgayNhap());
		System.out.println("Số Lượng: " + super.getSoLuong());
		System.out.println("Giá Bán: " + super.getGiaBan());
		System.out.println("Nguồn Gốc: " + super.getNguocGoc());
		System.out.println("Cam là 1 loại quả lâu đời, ăn rất ngon, "
				+ "bổ dưỡng và có rất nhiều loại táo khác nhau");
	}
}
