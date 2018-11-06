package week8;

import java.io.*;

public class Exception {

    public static void main(String[] args) throws IOException {
        NullPointerException();
        ArrayIndexOutOfBoundsException();
        ArithmeticException();
        ClassCastException();
        FileNotFoundException();
        IOException();
    }

    // NullPointerException
    public static void NullPointerException() throws NullPointerException {
        try {
            String str = null;
            if (str.equals("None")) {
                System.out.print("OK");
            } else {
                System.out.print("Error: ");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }

    }

    // ArrayIndexOfBoundException
    public static void ArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        try {
            int[] arr = {0, 1};
            System.out.println(arr[1000]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }

    }

    // ArithmeticException
    public static void ArithmeticException() throws ArithmeticException {
        try {
            System.out.println(0 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

    }

    // ClassCastException
    public static void ClassCastException() throws ClassCastException {
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;
            System.out.println(s);
        } catch (ClassCastException e) {
            System.out.println("Error: " + e);
        }

    }

    // FileNotFoundException
    public static void FileNotFoundException() throws FileNotFoundException {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(new File("File???")));
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    // IOException
    public static void IOException() throws IOException {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
