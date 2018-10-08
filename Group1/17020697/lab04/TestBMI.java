package lab_04_testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBMI {

	@Test
	void test1() {
		//fail("Not yet implemented");
		
		String b = StatisArrayJunit.BMI(75, 1.65);
		assertEquals("Beo phi",b);
		
	}
	void test2() {
		String b = StatisArrayJunit.BMI(70, 1.65);
		assertEquals("Beo phi",b);
		
	}
	void test3() {
		String b = StatisArrayJunit.BMI(50, 1.70);
		assertEquals("Thieu can",b);
	}
	void test4() {
		String b = StatisArrayJunit.BMI(40.5, 1.20);
		assertEquals("Beo phi",b);
	}
	void test5() {
		String b = StatisArrayJunit.BMI(62, 1.72);
		assertEquals("Binh thuong",b);
	}
}
