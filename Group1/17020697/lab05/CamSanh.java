package bt;

public class CamSanh extends Orange{
	private int WaterRate;
	private String DateImport;
	private int amount;
	
	
	//getter/setter
	public int getWaterRate() {
		return WaterRate;
	}
	public void setWaterRate(int waterRate) {
		WaterRate = waterRate;
	}
	public String getDateImport() {
		return DateImport;
	}
	public void setDateImport(String dateImport) {
		DateImport = dateImport;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	//Constructor
	public CamSanh() {
		// TODO Auto-generated constructor stub
		this.amount = 0;
		this.DateImport = null;
		this.WaterRate = 50;
		this.setColour("dark-green");
	}
	public CamSanh(int a,String d,int wr, String color) {
		// TODO Auto-generated constructor stub
		this.amount = a;
		this.DateImport = d;
		this.WaterRate = wr;
		this.setColour(color);
	}
	@Override
	public String toString() {
		return  this.amount+" "+this.getColour() +" oranges with "+ this.WaterRate + " percentage of water";
	}

	
}
