package bai_tap_tuan_5;

public class Qua_tao extends Hoa_qua {
	String Loai_tao;

	public String getLoai_tao() {
		return Loai_tao;
	}

	public void setLoai_tao(String loai_tao) {
		Loai_tao = loai_tao;
	}
	public void showInfor() {
		super.showInfor();
		System.out.println("Loai tao:"+this.getLoai_tao());
	}
}
