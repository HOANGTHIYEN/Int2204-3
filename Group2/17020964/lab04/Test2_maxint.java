package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2_maxint {

	@Test
	void test() {
		//fail("Not yet implemented");
		lab4 l4 = new lab4();
		int n = l4.maxint(14,5);
		assertEquals(6,n);
	}

}
