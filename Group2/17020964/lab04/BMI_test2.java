package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMI_test2 {

	@Test
	void test() {
		//fail("Not yet implemented");
		lab4 l4= new lab4();
		String value = lab4.BMI(44.5, 3.5);
		assertEquals("Thừa cân", value);
	}

}
