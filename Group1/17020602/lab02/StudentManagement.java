public class StudentManagement {
	static Student[] hocsinh = new Student[100];

	public static void main(String args[]) {

		Student hs = new Student();
		Student hs1 = new Student();
		Student hs2 = new Student("Do Tuan Bac", "17021702", "17020602@vnu.edu.vn");
		hs.setName("Do Tuan Bac");
		hs.setId("17020602");
		hs.setGroup("INT22042");
		hs.setEmail("ninjakid999@gmail.com");
		System.out.println(hs.getName());
		System.out.println(hs.getInfo());
		System.out.println(hs1.getInfo());
		System.out.println(hs2.getInfo());

		if (sameGroup(hs, hs1))
			System.out.println("2 hoc sinh cung lop");
		else
			System.out.println("2 hoc sinh khac lop");
	}

	public static boolean sameGroup(Student s1, Student s2) {
		if (s1.getGroup().equals(s2.getGroup()))
			return true;
		else
			return false;
	}

	public static void studentsByGroup() {
		int n = hocsinh.length;
		for (int i = 0; i < n; i++)
			System.out.println(hocsinh[i].getName() + " " + hocsinh[i].getId() + " " + hocsinh[i].getGroup() + " "
					+ hocsinh[i].getEmail() + " ");

	}

	public static void removeStudent(String id) {
		int n = hocsinh.length;
		for (int i = 0; i < n; i++) {
			if (hocsinh[i].getId() == id) {
				for (int j = i; j < n; j++)
					hocsinh[j] = hocsinh[j + 1];
				n--;
			}
		}

	}
}
