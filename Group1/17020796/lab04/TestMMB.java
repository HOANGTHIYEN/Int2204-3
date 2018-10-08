import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMMB {

	@Test
	void Max0() {
		int a = MMB.Max(5,6 );
		assertEquals(6,a);
	}
	@Test
	void Max1() {
		int b = MMB.Max(-5, 3);
		assertEquals(3,b);
	}
	@Test
	void Max2() {
		int c = MMB.Max(8, 8);
		assertEquals(8,c);
	}
	@Test
	void Max3() {
		int d = MMB.Max(6, -1);
		assertEquals(6,d);
	}
	@Test
	void Max4() {
		int e = MMB.Max(9, 12);
		assertEquals(12,e);
	}
	@Test
	void Min0() {
		int[] arr0 = {15, 3, 5, 7};
		int a = MMB.Min(arr0);
		assertEquals(3,a);
	}
	@Test
	void Min1() {
		int[] arr1 = {5, 3, 6, 2, 1};
		int b = MMB.Min(arr1);
		assertEquals(1,b);
	}
	@Test
	void Min2() {
		int[] arr2 = {-2, -5, 5, 6, 7};
		int c = MMB.Min(arr2);
		assertEquals(-5,c);
	}
	@Test
	void Min3() {
		int[] arr3 = {-7, 7, 9, 11, -3};
		int d = MMB.Min(arr3);
		assertEquals(-7,d);
	}
	@Test
	void Min4() {
		int[] arr4 = {2, 3, 5, 7, 1, 200, 500, 0};
		int e = MMB.Min(arr4);
		assertEquals(0,e);
	}
	@Test
	void BMI0() {
		String a = MMB.BMI(38,1.55);
		assertEquals("Thieu Can",a);
	}
	@Test
	void BMI1() {
		String b = MMB.BMI(52,1.65);
		assertEquals("Binh thuong",b);
	}
	@Test
	void BMI2() {
		String c = MMB.BMI(68,1.65);
		assertEquals("Thua can",c);
	}
	@Test
	void BMI3() {
		String d = MMB.BMI(86.7,1.7);
		assertEquals("Beo phi",d);
	}
	@Test
	void BMI4() {
		String e = MMB.BMI(47,1.65);
		assertEquals("Thieu can",e);
	}

}