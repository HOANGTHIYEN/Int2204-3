package JavaWeek4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CauCTest {
	@Test
	void test() {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều cao: ");
		Double height = Double.parseDouble(sc.nextLine());
		System.out.print("Nhập cân nặng: ");
		Double weight = Double.parseDouble(sc.nextLine());
		String actual_value = CauC.testBMI(weight, height);
		System.out.println("Nhập giá trị kì vọng(Thừa Cân, Béo Phì, Thiếu Cân): ");
		String expected_value = sc.nextLine();
		assertEquals(expected_value, actual_value);
		sc.close();
		*/
		String actual_value = CauC.testBMI(25, 180);
		assertEquals("Thừa Cân", actual_value);
	}
	@Test
	void test2() {
		String actual_value = CauC.testBMI(250, 180);
		assertEquals("Thừa Cân", actual_value);
	}
	@Test
	void test3() {
		String actual_value = CauC.testBMI(1000000, 180);
		assertEquals("Béo Phì", actual_value);
	}
	@Test
	void test4() {
		String actual_value = CauC.testBMI(25, 1.83);
		assertEquals("Thừa Cân", actual_value);
	}
	@Test
	void test5() {
		String actual_value = CauC.testBMI(60, 1.71);
		assertEquals("Bình Thường", actual_value);
	}
}
