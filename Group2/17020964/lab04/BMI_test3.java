package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMI_test3 {

	@Test
	void test() {
		//fail("Not yet implemented");
		lab4 l4= new lab4();
		String value = lab4.BMI(50.6, 2.0);
		assertEquals("Béo phì", value);
	}

}
