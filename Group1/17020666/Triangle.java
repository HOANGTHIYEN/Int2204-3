package com.lab06;
public class Triangle extends Shape {
		private double a, b, c;

		public Triangle() {
		}

		public Triangle(toado td,double a, double b, double c,   String color,boolean filled) {
			super(color, filled);
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double getC() {
			return c;
		}

		public void setC(double c) {
			this.c = c;
		}

		public double getArea_Triangle() {
			double p = (this.a + this.b + this.c) / 2;
			double Area = Math.sqrt(p*(p - this.a) * (p - this.b) * (p - this.c));
			return ((double)Math.round(Area*1000)/1000);
		}

		public double getPerimeter_Triangle() {
			return this.a + this.b + this.c ;
		}
		@Override
		public String toString() {
		  
		//return super.toString();
		 return "ba canh tam giac lan luot la: "+a+" "+b+" "+c+" \ndien tich cua hinh tam giac la: "+getArea_Triangle()+"\nchu vi hinh tam giac la: "+getPerimeter_Triangle();
		}



}
