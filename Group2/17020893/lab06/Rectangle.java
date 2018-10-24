package JavaWeek6;

public class Rectangle extends Shape {	
	private double width = 1.0;
	private double length = 1.0;
	// Constructor
		public Rectangle() {}
		
		public Rectangle(double width, double length) {
			this.width = width;
			this.length = length;
		}

		public Rectangle(double width, double length, String color, boolean filled) {
			super(color, filled);
			this.width = width;
			this.length = length;	
		}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width + length)*2;
    }
    public String getInfo() {
    	return "Hình chữ nhật có chiều rộng và chiều dài lần lượt là: " + getWidth() + ", " + getLength();
    }
}
