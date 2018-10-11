package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinArr_test2 {

	@Test
	void test() {
		//fail("Not yet implemented");
		int arr[]= {4,55,3,566,32,33,53,9};
//		lab4 l4= new lab4();
		int n = lab4.minarr(arr);
		assertEquals(4, n);
	}

}
