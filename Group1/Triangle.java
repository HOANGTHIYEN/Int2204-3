package com.lab06;
public class Triangle extends Shape {

        protected int pX1,pY1,pX2,pY2,pX3,pY3;
		public Triangle() {
		}

		public Triangle(int pX1,int pY1,int pX2,int pY2,int pX3,int pY3) {
			this.pX1 = pX1;
			this.pY1 = pY1;
			this.pX2 = pX2;
			this.pY2 = pY2;
			this.pX3 = pX3;
			this.pY3 = pY3;			
		}

		public int getpX1() {
			return pX1;
		}

		public void setpX1(int pX1) {
			this.pX1 = pX1;
		}

		public int getpY1() {
			return pY1;
		}

		public void setpY1(int pY1) {
			this.pY1 = pY1;
		}

		public int getpX2() {
			return pX2;
		}

		public void setpX2(int pX2) {
			this.pX2 = pX2;
		}

		public int getpY2() {
			return pY2;
		}

		public void setpY2(int pY2) {
			this.pY2 = pY2;
		}

		public int getpX3() {
			return pX3;
		}

		public void setpX3(int pX3) {
			this.pX3 = pX3;
		}

		public int getpY3() {
			return pY3;
		}

		public void setpY3(int pY3) {
			this.pY3 = pY3;
		}
		
		

}
