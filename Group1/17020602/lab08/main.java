package w8_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args)  {
	
		 testNullPointerException(null);
		 testArrayIndexOutOfBoundsException();
		 testArithmeticException();
		 testClassCastException();
		 testFileNotFoundException();

	}

	// NullPointerException
	public static void testNullPointerException(String s) {     //lỗi null
		try {
			System.out.println(s.toLowerCase());
		}catch(NullPointerException n) {
			System.out.println("Lỗi null");
		}
		
	}

	// ArrayIndexOfBoundException
	public static void testArrayIndexOutOfBoundsException()  {      //Lỗi mảng
		try {
			int[] test = { 0, 1 };
		System.out.println(test[10]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Lỗi khai báo phần tử mảng");
		}
		
	}

	// ArithmeticException
	public static void testArithmeticException() {          //Lỗi chia cho 0
		try {
			System.out.println(5 / 0);
		}catch(ArithmeticException ari) {
			System.out.println("Lỗi chia cho 0 ");
		}
		
	}

	// ClassCastException
	public static void testClassCastException()  {          //lỗi không ép được dạng
		try {
			Object i = Integer.valueOf(23);
		i = (String) i;
		}catch(ClassCastException c) {
			System.out.println("Lỗi không ép được dạng");
		}
		
	}

	// FileNotFoundException
	public static void testFileNotFoundException() {        //lỗi không đọc được file
		try {
			@SuppressWarnings({ "resource", "unused" })
			FileInputStream fileIS = new FileInputStream("doesn't exist");
		} catch (FileNotFoundException FNFE) {
			System.out.println("Lỗi không đọc được file");
		}
	}


	

}