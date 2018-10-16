package quest3;

public class lol {
private String ten,level,ngaychoi,songay,tuongtu,ip,rp,rank;

public lol(String ten, String level, String ngaychoi, String songay, String tuongtu, String ip, String rp,
		String rank) {
	super();
	this.ten = ten;
	this.level = level;
	this.ngaychoi = ngaychoi;
	this.songay = songay;
	this.tuongtu = tuongtu;
	this.ip = ip;
	this.rp = rp;
	this.rank = rank;
}
public void  Info()
{
	System.out.println("---League of Legends---");
	System.out.println("Tên nick : "+ten);
	System.out.println("Level: "+level);
	System.out.println("Ip : "+ip);
	System.out.println("Rp: "+rp);
	System.out.println("Tướng tủ: "+tuongtu);
	System.out.println("Năm chơi: "+2013);
	System.out.println("Số ngày chơi : "+songay);
	System.out.println("");
}
public String getTen() {
	return ten;
}

public void setTen(String ten) {
	this.ten = ten;
}

public String getLevel() {
	return level;
}

public void setLevel(String level) {
	this.level = level;
}

public String getNgaychoi() {
	return ngaychoi;
}

public void setNgaychoi(String ngaychoi) {
	this.ngaychoi = ngaychoi;
}

public String getSongay() {
	return songay;
}

public void setSongay(String songay) {
	this.songay = songay;
}

public String getTuongtu() {
	return tuongtu;
}

public void setTuongtu(String tuongtu) {
	this.tuongtu = tuongtu;
}

public String getIp() {
	return ip;
}

public void setIp(String ip) {
	this.ip = ip;
}

public String getRp() {
	return rp;
}

public void setRp(String rp) {
	this.rp = rp;
}

public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}

}
