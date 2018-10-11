package tuan4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class TestA {

	@Test
	void test() {
		int a = 3;
		int b = 4;
		int c = 4; // giá trị kiểm tra.
		int x = tuan4.GTLN(a, b);
		assertEquals(c, x);

	}

	@Test
	void test1() {
		int a = 3;
		int b = 4;
		int c = 3; // giá trị kiểm tra.
		int x = tuan4.GTLN(a, b);
		assertEquals(c, x);

	}

	@Test
	void test2() {
		int a = 14;
		int b = 4;
		int c = 4; // giá trị kiểm tra.
		int x = tuan4.GTLN(a, b);
		assertEquals(c, x);

	}

	@Test
	void test3() {
		int a = 3;
		int b = 21;
		int c = 21; // giá trị kiểm tra.
		int x = tuan4.GTLN(a, b);
		assertEquals(c, x);

	}

	@Test
	void test4() {
		int a = 14;
		int b = -5;
		int c = 14; // giá trị kiểm tra.
		int x = tuan4.GTLN(a, b);
		assertEquals(c, x);

	}

}
