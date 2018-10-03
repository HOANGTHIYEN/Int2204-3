package pk;

import static pk.ham.BMI;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testbmi {

	@Test
	void test1() {
		assertEquals("Thieu can", BMI(1.5, 40));
	}
	@Test
	void test2() {
		assertEquals("Binh thuong", BMI(1.8, 70));
	}
	@Test
	void test3() {
		assertEquals("Thua can",BMI(1.7, 70));
	}
	@Test
	void test4() {
		assertEquals("Beo phi", BMI(1.5, 80));
	}
	@Test
	void test5() {
		assertEquals("Beo phi",BMI(1.6, 100));

	}
}
