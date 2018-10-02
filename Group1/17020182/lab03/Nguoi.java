package lab3_3;

public class Nguoi {
	private String name;
	private boolean sex; //male 1 ;female 0
	private String job;
	private int DOB;     //date of birth
	private int height;
	
	
	//getter/setter
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Nguoi(String name, boolean sex, String job, int dOB, int height) {
		super();
		this.name = name;
		this.sex = sex;
		this.job = job;
		DOB = dOB;
		this.height = height;
	}

	//Constructor
		
		
	
}
