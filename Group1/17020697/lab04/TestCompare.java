package lab_04_testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompare {

	@Test
	void test1() {
		int a = StatisArrayJunit.Compare(2, 4);
		assertEquals(4, a);
		
	}
	void test2() {
		int e = StatisArrayJunit.Compare(71261, 123567);
		assertEquals(123567, e);
	}
	
	
	void test3() {
		int b = StatisArrayJunit.Compare(2235, 4373);
		assertEquals(4373, b);
	}
	void test4() {
		int c = StatisArrayJunit.Compare(83562, 4134);
		assertEquals(83562, c);
	}
	void test5() {
		int d = StatisArrayJunit.Compare(-22348,-43257);
		assertEquals(-22348, d);
	}

}
