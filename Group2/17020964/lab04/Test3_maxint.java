package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test3_maxint {

	@Test
	void test() {
		//fail("Not yet implemented");
		lab4 l4 = new lab4();
		int n = l4.maxint(14,33);
		assertEquals(33,n);
	}

}
