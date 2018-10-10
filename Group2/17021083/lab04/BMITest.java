package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BMITest {

	@Test
	public void test1() 
	{
		assertEquals("Thừa cân",lab04.BMI(65,1.66f));
	}
	@Test
	public void test2() 
	{
		assertEquals("Thiếu cân",lab04.BMI(45,1.65f));
	}
	@Test
	public void test3() 
	{
		assertEquals("Bình thường",lab04.BMI(50,1.6f));
	}
	@Test
	public void test4() 
	{
		assertEquals("Béo phì",lab04.BMI(80,1.6f));
	}
	@Test
	public void test5() 
	{
		assertEquals("Thừa cân",lab04.BMI(70,1.5f));
	}
}
