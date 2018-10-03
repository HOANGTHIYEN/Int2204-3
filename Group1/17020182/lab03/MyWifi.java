package lab3_3;

public class MyWifi {
	private String internetHost;
	private String nameRouter;
	private double maxSpeedUp;
	private double maxSpeedDown;
	public String getInternetHost() {
		return internetHost;
	}
	public void setInternetHost(String internetHost) {
		this.internetHost = internetHost;
	}
	public String getNameRouter() {
		return nameRouter;
	}
	public void setNameRouter(String nameRouter) {
		this.nameRouter = nameRouter;
	}
	public double getMaxSpeedUp() {
		return maxSpeedUp;
	}
	public void setMaxSpeedUp(double maxSpeedUp) {
		this.maxSpeedUp = maxSpeedUp;
	}
	public double getMaxSpeedDown() {
		return maxSpeedDown;
	}
	public void setMaxSpeedDown(double maxSpeedDown) {
		this.maxSpeedDown = maxSpeedDown;
	}
	public MyWifi(String internetHost, String nameRouter, double maxSpeedUp, double maxSpeedDown) {
		super();
		this.internetHost = internetHost;
		this.nameRouter = nameRouter;
		this.maxSpeedUp = maxSpeedUp;
		this.maxSpeedDown = maxSpeedDown;
	}
}
