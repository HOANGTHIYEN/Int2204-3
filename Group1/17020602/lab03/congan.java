package quest3;

public class congan {
 private   String ma,ten,bophan,vitri,age,thoi;

public congan(String ma, String ten, String bophan, String vitri, String age, String thoi) {
	super();
	this.ma = ma;
	this.ten = ten;
	this.bophan = bophan;
	this.vitri = vitri;
	this.age = age;
	this.thoi = thoi;
}
public void Info()
{
	System.out.println("---Công An---");
	System.out.println("Đơn vị : "+ma);
	System.out.println("Tên : "+ten);
	System.out.println("Bộ phận : "+bophan);
	System.out.println("Vị trí công tác: "+vitri);
	System.out.println("Tuổi : "+age);
	System.out.println("Thời hạn công tác : "+thoi);
	System.out.println("");
}
public String getMa() {
	return ma;
}

public void setMa(String ma) {
	this.ma = ma;
}

public String getTen() {
	return ten;
}

public void setTen(String ten) {
	this.ten = ten;
}

public String getBophan() {
	return bophan;
}

public void setBophan(String bophan) {
	this.bophan = bophan;
}

public String getVitri() {
	return vitri;
}

public void setVitri(String vitri) {
	this.vitri = vitri;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getThoi() {
	return thoi;
}

public void setThoi(String thoi) {
	this.thoi = thoi;
} ;
 
}
