
public class Student {
	public String name;
	public String id;
	public int birthyear;
	public String clas;
	public String adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Student(String name, String id, int birthyear, String clas, String adress) {
		this.name = name;
		this.id = id;
		this.birthyear = birthyear;
		this.clas = clas;
		this.adress = adress;
	}
	
	public Student() {
		this.name = "SV";
		this.id = "ID";
		this.birthyear = 1998;
		this.clas = "CD";
		this.adress = "Nam Dinh";
}
	public void getInfo()
	{
		System.out.println("Name"+this.getName());
		System.out.println("Id" + this.getId());
		System.out.println("Birthyear"+this.getBirthyear());
		System.out.println("Class:"+this.getClas());
		System.out.println("Adress"+ this.getAdress());
	}
}
