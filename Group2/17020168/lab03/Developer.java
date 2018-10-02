
public class Developer {
	private String name;
	private int age;
	private String school;
	private String add;
	private String language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Developer(String name, int age, String school, String add, String language) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.add = add;
		this.language = language;
	}
	
}
