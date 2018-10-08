package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBMI {

	@Test
	void test() {
		double w=54.8;
		double h = 1.69;
		String b = BMI.tinhBMI(w, h);
		assertEquals("Binh thuong", b);
	}
	
	@Test
	void test1() {
		double w = 52.5;
		double h = 1.53;
		String b1 = BMI.tinhBMI(w, h);
		assertEquals("Binh thuong", b1);
	}
	@Test
	void test2() {
		double w = 80;
		double h = 1.63;
		String b2 = BMI.tinhBMI(w, h);
		assertEquals("Beo phi", b2);
	}
	@Test
	void test3() {
		double w = 70.5;
		double h = 1.73;
		String b3 = BMI.tinhBMI(w, h);
		assertEquals("Thua can", b3);
	}
	@Test
	void test4() {
		double w = 45;
		double h = 1.7;
		String b4 = BMI.tinhBMI(w, h);
		assertEquals("Thieu can", b4);
	}
}
