package tuan4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

class testB {

	@Test
	void test() {
		int[] ar= {1, 2, 3, 4, 5, 6};

		int x = tuan4.GTNN(ar, ar.length);
		int k=1;
		assertEquals(k, x);
		
	}
	@Test
	void test1() {
		int[] ar= {1, 2, 3, 4, 5, 6};

		int x = tuan4.GTNN(ar, ar.length);
		int k=2;
		assertEquals(k, x);
		
	}
	@Test
	void test2() {
		int[] ar= {1, 2, 3, 4, 5, 6,-5, -91, 100};

		int x = tuan4.GTNN(ar, ar.length);
		int k=-91;
		assertEquals(k, x);
		
	}
	@Test
	void test3() {
		int[] ar= {-5, 2, -5, 4, -11, 6};

		int x = tuan4.GTNN(ar, ar.length);
		int k=-11;
		assertEquals(k, x);
		
	}
	@Test
	void test4() {
		int[] ar= {1444, -555, 3, 555,-100, 6};

		int x = tuan4.GTNN(ar, ar.length);
		int k=-555;
		assertEquals(k, x);
		
	}

}
