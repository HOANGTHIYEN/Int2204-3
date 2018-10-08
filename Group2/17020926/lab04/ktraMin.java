package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ktraMin {

	@Test
	void test() {
		int a[] = {0,1,2};
		int m = ktra.Min(a);
		assertEquals(0, m);
	}
	@Test
	void test1() {
		int a1[] = {12,24,3,23,5,7,3};
		int m1 = ktra.Min(a1);
		assertEquals(3, m1);
	}
	@Test
	void test2() {
		int a2[] = {38,43,54,13,56,88};
		int m2 = ktra.Min(a2);
		assertEquals(13, m2);
	}
	@Test
	void test3() {
		int a3[] = {21,34,56,3,466,56};
		int m3 = ktra.Min(a3);
		assertEquals(3, m3);
	}
	@Test
	void test4() {
		int a4[] = {12,23,46,10,9,1234,1235};
		int m4 = ktra.Min(a4);
		assertEquals(9, m4);
	}
}
