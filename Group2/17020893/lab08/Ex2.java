package JavaWeek8;

import java.io.*;

import java.util.*;

public class Ex2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// -------- test NullPointerException
		 testNullPointerException(null);

		// -------- test ArrayIndexOfBoundException
		// testArrayIndexOutOfBoundsException();

		// -------- test ArithmeticException
		// testArithmeticException();

		// test ClassCastException
		// testClassCastException();

		// test IOException
		// testIOException();

		// test FileNotFoundException
		// testFileNotFoundException();

	}

	// NullPointerException
	public static void testNullPointerException(String s) throws NullPointerException {
		try {
			System.out.println(s.toLowerCase());
		}catch(NullPointerException n) {
			System.out.println("Exception: " + n);
		}
		
	}

	// ArrayIndexOfBoundException
	public static void testArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
		try {
			int[] test = { 0, 1 };
		System.out.println(test[10]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception: " + a);
		}
		
	}

	// ArithmeticException
	public static void testArithmeticException() throws ArithmeticException {
		try {
			System.out.println(5 / 0);
		}catch(ArithmeticException ari) {
			System.out.println("Exception: " + ari);
		}
		
	}

	// ClassCastException
	public static void testClassCastException() throws ClassCastException {
		try {
			Object i = Integer.valueOf(23);
		i = (String) i;
		}catch(ClassCastException c) {
			System.out.println("Exception: " + c);
		}
		
	}

	// FileNotFoundException
	public static void testFileNotFoundException() throws FileNotFoundException {
		try {
			@SuppressWarnings({ "resource", "unused" })
			FileInputStream fileIS = new FileInputStream("doesn't exist");
		} catch (FileNotFoundException FNFE) {
			System.out.println("Exception: " + FNFE);
		}
	}

	// IOException
	public static void testIOException() throws IOException {
		int i = 1;
		try {
			if (i == 1)
				throw new IOException();
		} catch (IOException io) {
			System.out.println("Exception: " + io);
		}

	}

}
