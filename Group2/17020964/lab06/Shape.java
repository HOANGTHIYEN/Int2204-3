package lab6;

public abstract class Shape extends Diagram{
	protected int x,y;
	
	Shape(int x,int y){
		this.x=x;
		this.y=y;
	}
	public abstract void draw();
	public abstract void erase();
	public void moveTo(int x1,int y1) {
		this.x=x1;
		this.y=y1;
		erase();
		draw();
	}
		
	

}
