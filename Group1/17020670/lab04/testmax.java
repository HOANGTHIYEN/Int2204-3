package pk;

import static pk.ham.Max;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testmax {
	@Test
	void test1() {
		assertEquals(4, Max(2, 4));
	}
	@Test
	void test2() {
		assertEquals(-4, Max(-4, -10));
	}
	@Test
	void test3() {
		assertEquals(4, Max(-12, 4));
	}
	@Test
	void test4() {
		assertEquals(101, Max(10, 101));
	}
	@Test
	void test5() {
		assertEquals(13, Max(13, -1444));
	}
}
