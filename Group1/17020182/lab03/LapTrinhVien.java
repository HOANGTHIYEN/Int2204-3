package lab3_3;

public class LapTrinhVien {
	String Name;
	int Age;
	String Add;
	String School;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	public LapTrinhVien(String name, int age, String add, String school) {
		super();
		Name = name;
		Age = age;
		Add = add;
		School = school;
	}
	
	
}
