package anily.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TinhTrangTest {

	@Test
	void test1 ()
	{
		
		assertEquals("Thiếu Cân", Ham.tinhTrang(30, 1.62));
	}
	@Test
	void test2 ()
	{
	
		assertEquals("Béo Phì", Ham.tinhTrang(80, 1.62));
	}
	@Test
	void test3 ()
	{
		
		assertEquals("Bình Thường", Ham.tinhTrang(30, 1.2));
	}
	@Test
	void test4 ()
	{
	
		assertEquals("Bình Thường", Ham.tinhTrang(48, 1.61));
	}
	@Test
	void test5 ()
	{
	
		assertEquals("Thiếu Cân", Ham.tinhTrang(47, 1.63));
	}

}
