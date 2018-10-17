package bai_tap_tuan_5;

public class Cam_cao_phong extends Qua_cam {
	String vi;
	public String getVi() {
		return vi;
	}
	public void setVi(String vi) {
		this.vi = vi;
	}
	public void showInfor() {
		super.showInfor();
		System.out.println("Vi:"+this.getVi());
	}
}
