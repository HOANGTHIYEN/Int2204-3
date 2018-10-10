package lab03;

public class PS {
	private int a , b ;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String Ps() {
		return getA() + "/" + getB();
	}
}
