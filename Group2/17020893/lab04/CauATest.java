package JavaWeek4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CauATest {

	@Test
	void test() {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất: ");
		int n1 = sc.nextInt();
		System.out.println("Nhập số thứ hai: ");
		int n2 = sc.nextInt();
		int actual_value = CauA.findMax(n1, n2);
		System.out.println("Nhập giá trị kì vọng(Số lớn nhất của 2 số vừa nhập): ");
		int expected_value = sc.nextInt();	
		assertEquals(expected_value, actual_value);
		sc.close();
		*/
		int actual_value = CauA.findMax(30, 20);
		assertEquals(30, actual_value);		
	}
	@Test
	void test2() {
		int actual_value = CauA.findMax(30, 20);
		assertEquals(10, actual_value);
	}
	@Test
	void test3() {
		int actual_value = CauA.findMax(50, 100);
		assertEquals(100, actual_value);
	}
	@Test
	void test4() {
		int actual_value = CauA.findMax(1, 2);
		assertEquals(3, actual_value);
	}
	@Test
	void test5() {
		int actual_value = CauA.findMax(3, 2);
		assertEquals(3, actual_value);
	}
}
