package quest3;

public class doctor {
      private String id,name,hopital,chuyennganh,sinh,age;

	public doctor(String id, String name, String hopital, String chuyennganh, String sinh, String age) {
		super();
		this.id = id;
		this.name = name;
		this.hopital = hopital;
		this.chuyennganh = chuyennganh;
		this.sinh = sinh;
		this.age = age;
	}
public void Info()
{
	System.out.println("---Bác sĩ---");
	System.out.println("Mã bác sĩ : "+id);
	System.out.println("Tên bác sĩ : "+name);
	System.out.println("Bệnh viện : "+hopital);
	System.out.println("Chuyên ngành : "+chuyennganh);
	System.out.println("Tuổi : "+age);
	System.out.println("");
}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHopital() {
		return hopital;
	}

	public void setHopital(String hopital) {
		this.hopital = hopital;
	}

	public String getChuyennganh() {
		return chuyennganh;
	}

	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}

	public String getSinh() {
		return sinh;
	}

	public void setSinh(String sinh) {
		this.sinh = sinh;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
