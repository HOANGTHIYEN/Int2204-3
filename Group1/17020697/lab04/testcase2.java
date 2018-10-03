package lab_04_testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase2 {

	@Test
	void test1() {
		//fail("Not yet implemented");
		
		//test1
		int[] array1 = new int[100];
		array1[0] = 10;
		array1[1] = 8;
		array1[2] = 4;
		array1[3] = 3;
		array1[4] = 2;
		array1[5] = 6;
		array1[6] = 1;
		array1[7] = 7;
		array1[8] = 9;
		
		int tmp = StatisArrayJunit.MinArray(array1,9);
		assertEquals(1,tmp);
	}
	
	void test2() {
		//test2
				int[] array2 = {2,4,3,2,34,2,3,13,4 };
				int tmp = StatisArrayJunit.MinArray(array2, array2.length);
				assertEquals(2, tmp);
	}
	
	void test3() {
		//test3
				int[] array3 = {2,4,3,2,34,2,3,13,4,1,4,3,4,5,6,4,3,4,567,75,9,70,458,2435,479};
				int tmp = StatisArrayJunit.MinArray(array3, array3.length);
				assertEquals(1, tmp);
	}
	void test4() {
		//test4
				int[] array4 = {123,346,23,54,25,34,6245,324,6,45,72,43672,345,3,6236,324,523,3245,6,2,564572};
				int tmp = StatisArrayJunit.MinArray(array4, array4.length);
				assertEquals(2, tmp);	
	}
	void test5() {
		//test5
				int[] array5 = {1005,234235,3457,45674,84674,34634,7568,2367,235,23672,25762,2346273,14513,6342,1346};
				int tmp = StatisArrayJunit.MinArray(array5, array5.length);
				assertEquals(235, tmp);		
	}



	
	
}
	
	
