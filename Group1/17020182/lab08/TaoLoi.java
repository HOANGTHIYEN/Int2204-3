package lab8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TaoLoi {

	public static void main(String[] args) throws IOException{
		
		
     //1 NullPointerException
        String obj = null;
        System.out.println(obj .length());
		try {
//			Gây lỗi NPE nếu bạn cố gắng truy nhập null Object.
//			Gây lỗi NPE nếu bạn cố đổi null String.
//			Gây lỗi NPE nếu bạn cố truy nhập null Object trong quá trình khởi tạo Class.
			
			// VD1: Lỗi NPE xảy ra nếu bạn cố truy nhập một null Object
			Object techmasterObj = null;
			techmasterObj.hashCode();
		} catch (NullPointerException techmaster1) {
			System.out.println("Exception in TechmasterNPE1()");
			techmaster1.printStackTrace();
		}
	
		//2 java.lang.ArrayIndexOfBoundException  lỗi truy cập các chỉ số không hợp lệ trong mảng
		String[] s = new String[] {"hieu","duc"};
		String ss = s[3];
        System.out.println("String at 3 = " + ss);
        
        
        //3 ArithmeticException  lỗi số học
        int a = 10 / 0;
        
        //4 java.lang.ClassCastException	lỗi ép kiểu các đối tượng không hợp lệ
        Object x = new Integer(0);
        System.out.println((String)x); 
        
        //5 Java.io.IOSException	
        test m = new test();
        m.method();
        System.out.println("binh thuong");
        
        //6 java.io.FileNotFoundException		lỗi không tìm thấy file
        Scanner input = new Scanner(new File("doc.txt"));
        int n = input.nextInt();
        System.out.println(n);
        input.close();
        
	}
	
}
//Java.io.IOSException
	class test{
		void method()throws IOException{
			throw new IOException("thiết bị lỗi");
		}
	}

