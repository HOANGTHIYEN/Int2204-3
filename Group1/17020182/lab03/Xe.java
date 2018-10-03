package lab3_3;

public class Xe {
	private String brand;
	private String number;
	private String type;
	private int cc;
	private int maxSpeed;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Xe(String brand, String number, String type, int cc, int maxSpeed) {
		super();
		this.brand = brand;
		this.number = number;
		this.type = type;
		this.cc = cc;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
