package tuan4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class testC {

	@Test
	void test() {
        
		String x = tuan4.BMI(52, 1.75);
		String k;
		k = "Thiếu cân";
		
		assertEquals(k, x);

	}
	@Test
	void test1() {
        
		String x = tuan4.BMI(63, 1.75);
		String k;
		k = "Thiếu cân";
		
		assertEquals(k, x);

	}
	@Test
	void test2() {
        
		String x = tuan4.BMI(63, 1.75);
		String k;
		k = "Bình thường";
		
		assertEquals(k, x);

	}
	@Test
	void test3() {
        
		String x = tuan4.BMI(63, 1.75);
		String k;
		k = "Thiếu cân";
		
		assertEquals(k, x);

	}
	@Test
	void test4() {
        
		String x = tuan4.BMI(52, 1.75);
		String k;
		k = "Thừa cân";
		
		assertEquals(k, x);

	}
	
	
}
