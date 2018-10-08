package tuan5_2;

public class Square extends Rectangle{
	protected double side;

    public Square() {
    	
    }

    public Square(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
       super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }
    
  
    public void setWidth(double side) {
        setSide(side);
    }
    
   
    public void setLength(double side) {
    	 setSide(side);
    }

	@Override
	public String toString() {
		return "Square [side=" + side + ", width=" + width + ", length=" + length + ", getPerimeter()=" + getPerimeter()
				+ ", getArea()=" + getArea() + "]";
	}

	
    
      
    
}
