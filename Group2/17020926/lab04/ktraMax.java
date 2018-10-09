package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ktraMax {

	@Test
	void test() {
		int m = ktra.Max(4, 5);
		assertEquals(5, m);
	}
	@Test
	void test1() {
		int m1 = ktra.Max(50, 90);
		assertEquals(90, m1);
	}
	@Test
	void test2() {
		int m2 = ktra.Max(40, 34);
		assertEquals(40, m2);
	}
	@Test
	void test3() {
		int m3 = ktra.Max(2, 3);
		assertEquals(3, m3);
	}
	@Test
	void test4() {
		int m4 = ktra.Max(1000, 10001);
		assertEquals(10001, m4);
	}
}
