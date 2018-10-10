package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SmallestTest {

	@Test
	public void test1() 
	{
		int[] a= {2,3,4,5,1};
		assertEquals(1,lab04.Smallest(a));
	}
	@Test
	public void test2() 
	{
		int[] a= {2,0,4,5,1};
		assertEquals(1,lab04.Smallest(a));
	}
	@Test
	public void test3() 
	{
		int[] a= {2,3,4,5};
		assertEquals(2,lab04.Smallest(a));
	}
	@Test
	public void test4() 
	{
		int[] a= {2,3,4,5,1,6,7};
		assertEquals(1,lab04.Smallest(a));
	}
	@Test
	public void test5() 
	{
		int[] a= {2,3,4,6,8,9};
		assertEquals(3,lab04.Smallest(a));
	}
}