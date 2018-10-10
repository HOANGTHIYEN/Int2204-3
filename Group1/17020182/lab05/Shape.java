package lab5_2;

public class Shape {
		protected String Color;
		protected boolean filled;
		
		//get , set
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			Color = color;
		}
		public boolean isFilled() {
			return filled;
		}
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		
		
		//constructor
		public Shape(String color, boolean filled) {
			Color = color;
			this.filled = filled;
		}
		
		public Shape()
		{
			this.Color="red";
			this.filled=true;
		}
		@Override
		public String toString()
		{
			return " Color : " + Color + ",\t Filled : " +filled;
		}
		
		
		
		
		
	}


