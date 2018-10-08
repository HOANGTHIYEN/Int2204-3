package com.lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_output {

	@Test
	public void test1() {
		//fail("Not yet implemented");
		 //input test = new input();
		 int result1=input.soNlonN(4, 5);
		 assertEquals(5,result1);
		 int result2=input.soNlonN(-10, 0);
		 assertEquals(0,result2);
		 int result3=input.soNlonN(-1, -5);
		 assertEquals(-1,result3);
		 int result4=input.soNlonN(-6, 6);
		 assertEquals(6,result4);
		 int result5=input.soNlonN(5,6);
		 assertEquals(6,result5);
		 }
	@Test
	public void test2(){
		int arr1[]= {3,-5,0,9};
		int a1=input.soNnhoN(arr1);
		assertEquals(-5,a1);
		int arr2[]= {9,100,7,0};
		int a2=input.soNnhoN(arr2);
		assertEquals(0,a2);
		int arr3[]= {-6,1,0,9,8,11};
		int a3=input.soNnhoN(arr3);
		assertEquals(-6,a3);
		int arr4[]= {-199,10,0,-100,5};
		int a4=input.soNnhoN(arr4);
		assertEquals(-199,a4);
		int arr5[]= {-4,-3,-2,-1,0};
		int a5=input.soNnhoN(arr5);
		assertEquals(-4,a5);
		
		
	}
	@Test
	public void test3() {
		String kqua1=input.indexBMI(58, 1.68);
		assertEquals("Bình thường",kqua1);
		String kqua2=input.indexBMI(49, 1.65);
		assertEquals("Thiếu cân",kqua2);
		String kqua3=input.indexBMI(80, 1.5);
		assertEquals("Béo phì",kqua3);
		String kqua4=input.indexBMI(80, 1.8);
		assertEquals("Thừa cân",kqua4);
		String kqua5=input.indexBMI(60, 1.7);
		assertEquals("Bình thường",kqua5);
	}

}