package anily.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimMaxTest {

	@Test
	void test1 ()
	{
		
		assertEquals(9, Ham.timMax(2, 9));
	}
	@Test
	void test2 ()
	{
	
		assertEquals(5, Ham.timMax(5, -9));
	}
	@Test
	void test3 ()
	{
		
		assertEquals(2, Ham.timMax(2, 0));
	}
	@Test
	void test4 ()
	{
		
		assertEquals(4, Ham.timMax(2, 4));
	}
	@Test
	void test5 ()
	{
		
		assertEquals(10, Ham.timMax(-2, 10));
	}

}
