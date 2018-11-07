package cau_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import expression.Addition;
import expression.Expression;
import expression.Numeral;
import expression.Square;

public class NullPointerException extends IOException /*Exception*/ {
	private int[] tmp = new int[3];
	private static String filepath = "C:\\Users\\Admin\\Desktop\\Capture1.png";
	
	
	public static void main(String[] args) {
		
		/** Loi 1*/
		NullPointerException t = initT();
		try {
			
			t.foo("Hi");
		} catch (Exception e) {
			// TODO: handle exception\
			System.out.println("Loi con tro null");
		}
		
		
		/** Loi 2*/
//		try {
//			NullPointerException t = new NullPointerException();
//			int[] array = new int[] {2,4,5,7};
//			
//			for(int i=0;i<array.length;i++) {
//				t.tmp[i] = array[i];
//			}
//		} catch (Exception e) {
//			// TODO: handle exception\
//			System.out.println("Loi chi so mang");
//		}
		
		
		/**Loi 4*/
//		try {
//			Null a =(Null) new classNull();
//		} catch (Exception e) {
//			// TODO: handle exception\
//			System.out.println("Loi ko the ep kieu");
//		}
	}
	
	
//	public static void main(String[] args) {
//		BufferedReader br = null;
//		String line;
//        try {	
//        	br = new BufferedReader(new FileReader(filepath));
//		    while ((line = br.readLine()) != null) {
//		    	System.out.println(line);
//		    }
//        } catch (IOException e) {
//        	System.err.println("An IOException was caught :"+e.getMessage());
//        	
//	    }
//        
//	}
	
	
	
	
	public void foo(String s) {
		System.out.println(s.toLowerCase());
	}
		
	private static NullPointerException initT() {
		return null;
	}

	public int[] getTmp() {
		return tmp;
	}

	public void setTmp(int[] tmp) {
		this.tmp = tmp;
	}
		
			
		
		
		
		
		
	}

