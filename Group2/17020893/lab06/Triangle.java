package JavaWeek6;

public class Triangle extends Shape {
	private double Edge1 = 1.0;
	private double Edge2 = 1.0;
	private double Edge3 = 1.0;

	// Constructor
	public Triangle() {
	}

	public Triangle(double Edge1, double Edge2, double Edge3) {
		this.Edge1 = Edge1;
		this.Edge2 = Edge2;
		this.Edge3 = Edge3;
	}

	public Triangle(double Edge1, double Edge2, double Edge3, String color, boolean filled) {
		super(color, filled);
		this.Edge1 = Edge1;
		this.Edge2 = Edge2;
		this.Edge3 = Edge3;
	}

	// setter getter
	public double getEdge1() {
		return Edge1;
	}

	public void setEdge1(double edge1) {
		Edge1 = edge1;
	}

	public double getEdge2() {
		return Edge2;
	}

	public void setEdge2(double edge2) {
		Edge2 = edge2;
	}

	public double getEdge3() {
		return Edge3;
	}

	public void setEdge3(double edge3) {
		Edge3 = edge3;
	}
	// area
	 public double area() {
		 double p = (Edge1+Edge2+Edge3)/2;
		 return Math.sqrt(p*(p-Edge1)*(p-Edge2)*(p-Edge3));
	 }
	// perimeter
	 public double perimeter() {
		 return Edge1 + Edge2 + Edge3;
	 }
	 public String getInfo() {
	    return "Hình tam giác có ba cạnh là: " + getEdge1() + ", " + getEdge2() + ", " + getEdge3();
	  }
}
