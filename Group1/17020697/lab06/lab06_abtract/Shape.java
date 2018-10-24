package lab06_abtract;

abstract class Shape {
	private double x,y;
	private boolean filled;

	abstract String draw();
	
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public Shape() {
		// TODO Auto-generated constructor stub
		this.x = 0;
		this.y = 0;
		this.filled = false;
		
	}
	
	abstract void moveUp();
	abstract void moveDown();
	abstract void moveLeft();
	abstract void moveRight();
	
	
	
	
}
