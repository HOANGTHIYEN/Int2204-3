package bt;

public class Orange extends Fruit{
	private String origin;
	private String season;
	private int dateOfExp;
	private double prizePerKg;
	
	//Constructor
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getDateOfExp() {
		return dateOfExp;
	}
	public void setDateOfExp(int dateOfExp) {
		this.dateOfExp = dateOfExp;
	}
	public double getPrizePerKg() {
		return prizePerKg;
	}
	public void setPrizePerKg(double prizePerKg) {
		this.prizePerKg = prizePerKg;
	}
	public Orange() {
		// TODO Auto-generated constructor stub
		this.dateOfExp = 0;
		this.origin = null;
		this.prizePerKg = 0;
		this.season = "summer";
	}
}
