package quest3;

public class music {
      private String tenbaihat,casi,nhacsi,follow,ngayramat;

	public music(String tenbaihat, String casi, String nhacsi, String follow, String ngayramat) {
		super();
		this.tenbaihat = tenbaihat;
		this.casi = casi;
		this.nhacsi = nhacsi;
		this.follow = follow;
		this.ngayramat = ngayramat;
	}
	public void Info()
	{
		System.out.println("---Music---");
		System.out.println("Tên bài hát: "+tenbaihat);
		System.out.println("Ca sĩ : "+casi);
		System.out.println("Nhạc sĩ: "+nhacsi);
		System.out.println("Follow : "+follow);
		System.out.println("Năm ra mắt : "+ngayramat);
		System.out.println("");
	}
	public String getTenbaihat() {
		return tenbaihat;
	}

	public void setTenbaihat(String tenbaihat) {
		this.tenbaihat = tenbaihat;
	}

	public String getCasi() {
		return casi;
	}

	public void setCasi(String casi) {
		this.casi = casi;
	}

	public String getNhacsi() {
		return nhacsi;
	}

	public void setNhacsi(String nhacsi) {
		this.nhacsi = nhacsi;
	}

	public String getFollow() {
		return follow;
	}

	public void setFollow(String follow) {
		this.follow = follow;
	}

	public String getNgayramat() {
		return ngayramat;
	}

	public void setNgayramat(String ngayramat) {
		this.ngayramat = ngayramat;
	} 
}
