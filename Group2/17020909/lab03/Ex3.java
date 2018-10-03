//Doi tuong con cho
public class ConCho {
	private String Name; //Ten con cho
	private float Cannang; //Can nang con cho
	private String Loai; //Chung loai con cho
	public void setName(String a) {
		this.Name = a;
	}
	public String getName() {
		return Name;
	}
	public void setCan(float b) {
		this.Cannang = b;
	}
	public float getCan() {
		return Cannang;
	}
	public void setLoai(String c) {
		this.Loai = c;
	}
	public String getLoai() {
		return Loai;
	}
}
//Doi tuong giao vien
public class Giaovien {
	private String Name; //Ten giao vien
	private String Subject; //Mon day hoc
	public void setName(String a) {
		this.Name = a;
	}
	public String getName() {
		return Name;
	}
	public void setSubject(float b) {
		this.Subject = b;
	}
	public float getSubject() {
		return Subject;
	}
}
//Doi tuong cai ban
public class Table {
	private float Dai; //Chieu dai ban
	private float Rong; //Chieu rong ban
	private float Cao; //Chieu cao ban
	private String Chat; //Chat lieu ban
	public void setDai(float a) {
		this.Dai = a;
	}
	public float getDai() {
		return Dai;
	}
	public void setRong(float a) {
		this.Rong = a;
	}
	public float getRong() {
		return Rong;
	}
	public void setCao(float a) {
		this.Cao = a;
	}
	public float getCao() {
		return Cao;
	}
	public void setChat(String a) {
		this.Chat = a;
	}
	public String getChat() {
		return Chat;
	}
}
//Doi tuong sinh vien
public class Student {
	private String Name; //Ten sinh vien
	private String MSSV; //Ma so sinh vien
	private int Age; //Tuoi sinh vien
	public void setName(String a) {
		this.Name = a;
	}
	public String getNam() {
		return Name;
	}
	public void setMS(String a) {
		this.MSSV = a;
	}
	public String getMS() {
		return MSSV;
	}
	public void setAge(int a) {
		this.Age = a;
	}
	public int getAge() {
		return Age;
	}
}
//Doi tuong quyen sach
public class Book {
	private String Name; //Ten sach
	private String Tacgia; //Ten tac gia sach
	public void setName(String a) {
		this.Name = a;
	}
	public String getNam() {
		return Name;
	}
	public void setTacgia(String a) {
		this.Tacgia = a;
	}
	public String getTacgia() {
		return Tacgia;
	}
}
 //Doi tuong hinh chu nhat
public class HCN {
	private float Dai; //Chieu dai hinh chu nhat
	private float Rong; //Chieu rong hinh chu nhat
	public void setDai(float a) {
		this.Dai = a;
	}
	public float getDai() {
		return Dai;
	}
	public void setRong(float a) {
		this.Rong = a;
	}
	public float getRong() {
		return Rong;
	}
} 