package anily.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoNhoNhatCuaMangTest {

	@Test
	void test1() {
		int [] arr = {1,2,3,4,5,6};
		assertEquals(1, Ham.soNhoNhatCuaMang(arr));
	}
	@Test
	void test2() {
		
		int [] arr = {1,2,-4,4,5,6};
		assertEquals(-4, Ham.soNhoNhatCuaMang(arr));
	}
	@Test
	void test3() {
		
		int [] arr = {1,2,3,4,5,6,5,7,0};
		assertEquals(0, Ham.soNhoNhatCuaMang(arr));
	}
	@Test
	void test4() {
		
		int [] arr = {8,10,3,4,5,6};
		assertEquals(3, Ham.soNhoNhatCuaMang(arr));
	}
	@Test
	void test5() {
	
		int [] arr = {0,1,2};
		assertEquals(0, Ham.soNhoNhatCuaMang(arr));
	}

}
