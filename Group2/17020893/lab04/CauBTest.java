package JavaWeek4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CauBTest {

	@Test
	void test() {
		/*
		int arr[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Số thứ "+ i + ": ");
			arr[i] = sc.nextInt();
		}
		int actual_value = CauB.minArr(arr, n);
		System.out.print("Nhập giá trị kì vọng(Min của mảng vừa nhập): ");
		int expected_value = sc.nextInt();	
		assertEquals(expected_value, actual_value);
		sc.close();
		*/
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 8;
		int actual_value = CauB.minArr(arr, 5);
		assertEquals(8, actual_value);
	}
	@Test
	void test2() {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 8;
		int actual_value = CauB.minArr(arr, 5);
		assertEquals(2, actual_value);
	}
	@Test
	void test3() {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 9;
		arr[4] = 8;
		int actual_value = CauB.minArr(arr, 5);
		assertEquals(9, actual_value);
	}
	@Test
	void test4() {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 8;
		int actual_value = CauB.minArr(arr, 5);
		assertEquals(1, actual_value);
	}
	@Test
	void test5() {
		int arr[] = new int[5];
		arr[0] = 0;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 8;
		int actual_value = CauB.minArr(arr, 5);
		assertEquals(0, actual_value);
	}
}
