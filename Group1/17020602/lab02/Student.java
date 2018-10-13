public class Student {
	private String name, id, group, email;

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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	String getInfo() {
		return name + " " + id + " " + group + " " + email;
	}

	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}

	public Student(String n, String sid, String em) {
		this.name = n;
		this.id = sid;
		this.email = em;
		this.group = "INT22041";
	}

	public Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.email = s.email;
		this.group = s.group;
	}

}
