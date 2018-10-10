package lab3_3;

public class GiangVien {
	String Name;
	boolean sex; //male - true, female - false
	int Age;
	String Charactor;//tinh cach
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	public GiangVien(String name, boolean i, int age, String charactor) {
		super();
		Name = name;
		this.sex = i;
		Age = age;
		Charactor = charactor;
	}
	
	
	
}
