package lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Bai_2 {

    public void docfile() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\tmp\\tets.txt"));

    }

    public void Array(int[] arr, int x) throws ArrayIndexOutOfBoundsException {
        System.out.println(arr[x]);

    }

    public void tenham() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    public void claass(Object s) throws ClassCastException {
        int x = (int) s;
    }

    public void chia0(int x) throws ArithmeticException {
        System.out.println(x/0);
    }

    public static void main(String[] args) {
        Bai_2 b = new Bai_2();
        try {
            b.docfile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] arr ={2,3};
            b.Array(arr, -1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            b.tenham();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try {
            b.claass("1236456");
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        try {
            b.chia0(10);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
