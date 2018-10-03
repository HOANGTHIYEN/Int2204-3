package pk;

import static pk.ham.Min;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testmin {

	@Test
	void test1() {
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 6;
		a[2] = -4;
		a[3] = 0;
		assertEquals(-4,Min(a, 4));
	}
	@Test
	void test2() {
		int[] b = new int[2];
		b[0] = 1;
		b[1] = 6;
		assertEquals(1, Min(b, 2));
	}
	@Test
	void test3() {
		int[] c = new int[5];
		c[0] = 1;
		c[1] = 6;
		c[2] = 0;
		c[3] = 0;
		c[4] = 7;
		assertEquals(0,Min(c, 5));
	}
	// đạt
	@Test
	void test4() {
		int[] d = new int[6];
		d[0] = 1;
		d[1] = -10;
		d[2] = -4;
		d[3] = 0;
		d[4] = 10;
		d[5] = 19;
		assertEquals(-10, Min(d, 6));
	}
	@Test
	void test5() {
		int[] e = new int[6];
		e[0] = 1;
		e[1] = 18;
		e[2] = -14;
		e[3] = 100;
		e[4] = 200;
		e[5] = -90;
		assertEquals(-90, Min(e, 6));
	}

}
