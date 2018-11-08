package community.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Bai2 {

	public void Cong ()throws Exception
	{
		int a = 0;
		int b =10/a;
		System.out.println( "b = "+b);
	}
	public void Chuoi ()
	{
		String s= null;
		System.out.println("do dai chuoi ="+s.length());
	}
	public void Mang ()
	{
		int a[] =new int [5];
		System.out.println("a[7] = "+a[7]);
	}
	public void LoiCast() throws Exception
	{
		Object o;
			o = "ab";
			int a = (int) o;
		
	}


	public void GhiFile () throws IOException
	{
		File f = new File ("C:\\data.txt");
		FileWriter fw = new FileWriter(f);
		fw.write ("Hello!");
		fw.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai2 b2 = new Bai2();
		// arithmetic exception
		try
		{
		b2.Cong();
		
		}
		catch (Exception e)
		{
			System.out.println("loi :"+e);
		}
		//  null pointer exception
		try
		{
		b2.Chuoi();
		
		}
		catch (Exception e)
		{
			System.out.println("loi :"+e);
		}
		//arrayindex
		try {
		b2.Mang();
		}
		catch(Exception e)
		{
			System.out.println("loi :"+e);
		}
		try {
			
			b2.LoiCast();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("loi :"+e);
		}
		try {
			b2.GhiFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("loi :"+e);
		
	
		}
		try {
			b2.LoiCast();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("loi : "+e);
		}
		
		
}
	
}


