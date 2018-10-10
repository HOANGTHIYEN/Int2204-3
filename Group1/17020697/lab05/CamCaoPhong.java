package bt;

public class CamCaoPhong extends Orange{
	private String quality;
	
	public CamCaoPhong() {
		// TODO Auto-generated constructor stub
		this.setQuality("1");
	}
	public CamCaoPhong(String color,String q,String o,int prize) {
		// TODO Auto-generated constructor stub
		this.setQuality(q);
		this.setColour(color);
		this.setOrigin(o);
		this.setPrizePerKg(prize);
	}
	
	
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	@Override
	public String toString() {
		return this.getPrizePerKg() + "k vnd per kilogram "+this.getColour()+ " Oranges with "+this.quality+" quality from "+ this.getOrigin();
	}
}
