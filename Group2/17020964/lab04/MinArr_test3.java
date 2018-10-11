package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinArr_test3 {

	@Test
	void test() {
		//fail("Not yet implemented");
		int arr[]= {4,5,31,5,32,333,52,9};
		lab4 l4= new lab4();
		int n = l4.minarr(arr);
		assertEquals(4, n);
	}

}
