package bai_tap_tuan_5;

public class Qua_cam extends Hoa_qua {
	String Loai_cam;

	public String getLoai_cam() {
		return Loai_cam;
	}

	public void setLoai_cam(String loai_cam) {
		Loai_cam = loai_cam;
	}
	public void showInfor() {
		super.showInfor();
		System.out.println("Loai cam :"+this.getLoai_cam());
	}
}
