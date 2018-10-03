package lab04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BiggerTest {

	@Test
	public void test1() {
		assertEquals(5,lab04.Bigger(5,3));
	}
	@Test
	public void test2() {
		assertEquals(6,lab04.Bigger(6,7));
	}
	@Test
	public void test3() {
		assertEquals(9,lab04.Bigger(2,9));
	}
	@Test
	public void test4() {
		assertEquals(16,lab04.Bigger(16,24));
	}
	@Test
	public void test5() {
		assertEquals(10001,lab04.Bigger(10001,99));
	}
}