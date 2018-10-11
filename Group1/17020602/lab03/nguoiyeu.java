package quest3;

public class nguoiyeu {
     private String ten,tuoi,truong,user;

	public nguoiyeu(String ten, String tuoi, String truong, String user) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.truong = truong;
		this.user = user;
	}
    public void Info()
    {
    	System.out.println("---Người yêu---");
    	System.out.println("Tên người yêu: "+ten);
    	System.out.println("Tuổi: "+tuoi);
    	System.out.println("Trường : "+truong);
    	System.out.println("User: "+user);
    	System.out.println("");
    }
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public String getTruong() {
		return truong;
	}

	public void setTruong(String truong) {
		this.truong = truong;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
