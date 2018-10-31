/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author Việt Hoàng
 */
public class Lab8Bai2 {

	//ham throws ArrayIndexOutOfBoundsException 
	 public static void array() throws ArrayIndexOutOfBoundsException 
	 {
		 int[] arr= {1,0};
		 System.out.println(arr[3]);

	 }

	 //ham throws  ArithmeticException
	 public static void split() throws ArithmeticException
	 {
		 int a= 10/0;
		 System.out.println(a);

	 }

	 //ham throws  NullPointerException
	 @SuppressWarnings("null")
	public static void Null() throws  NullPointerException
	 {
		String n=null;
		System.out.println(n.length());

	 }

	 //ham throws  ClassCastException
	 public static void cast() throws  ClassCastException
	 {
		 Object x = new Integer(0);
	     System.out.println((String)x);

	 }

	 //ham throws   FileNotFoundException + IOExeption

	@SuppressWarnings({ "resource"})
	public static void File() throws  IOException
	 {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("C:\\file.txt"));

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
		}

	 }

	public static void main(String[] args) {
	

		try {
			array();
		}catch(Exception e)
		{
                    System.out.println("truy cập trái phép phần tử của mảng");}
                
                
                try {
			split();
		}catch(Exception e)
		{
                    System.out.println("Lỗi chia cho 0");}
                try {
			Null() ;
		}catch(Exception e)
		{
                    System.out.println("phần tử truy cập là NULL");}
                try {
			cast();
		}catch(Exception e)
		{
                    System.out.println("dữ liệu không hợp lệ");}
                
                try {
			File();
		}catch(Exception e)
		{
                    System.out.println("không tồn tại dường dẫn file");}
        }
       
}   