package lab4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test2 {

	@Test
	void test1() {
		
		int a = Tuan_4.TimMax2So(4,8);
		assertEquals(8, a);
		
		int k[]= {2,4,6,2,1};
		int a2 = Tuan_4.TimMinMang(k,5);
		assertEquals(1, a2);
		
		String a3 = Tuan_4.BMINguoi(50,1.55);
		assertEquals("Bình thường", a3);
	}
	
	void test_2() {
		
		int a = Tuan_4.TimMax2So(4599,464);
		assertEquals(4599, a);
		
		int k[]= {10000,100000,10000000,10000000,1000000,99999,8989,9999999};
		int a2 = Tuan_4.TimMinMang(k,5);
		assertEquals(8989, a2);
		
		String a3 = Tuan_4.BMINguoi(50,1.55);
		assertEquals("Bình thường", a3);
	}
	
	void test3() {
	int a = Tuan_4.TimMax2So(40,999);
	assertEquals(999, a);
	
	int k[]= {20,457,676,62,156,99,66,3333,5555};
	int a2 = Tuan_4.TimMinMang(k,9);
	assertEquals(20, a2);
	
	String a3 = Tuan_4.BMINguoi(60,1.55);
	assertEquals("Thừa cân", a3);
	}
	
	void test4() {
	int a = Tuan_4.TimMax2So(4,99);
	assertEquals(99, a);
	
	int k[]= {2,4,6,2,1};
	int a2 = Tuan_4.TimMinMang(k,5);
	assertEquals(1, a2);
	
	String a3 = Tuan_4.BMINguoi(78,1.65);
	assertEquals("Béo phì", a3);
	}
	void test5() {
	int a = Tuan_4.TimMax2So(4,80);
	assertEquals(80, a);
	
	int p[]= {767654,7456,56745756,2340000,725427435,99999,567547,76574576,9999,333};
	int a2 = Tuan_4.TimMinMang(p,10);
	assertEquals(1, a2);
	
	String a3 = Tuan_4.BMINguoi(50,1.55);
	assertEquals("Thiếu cân", a3);
}
}
