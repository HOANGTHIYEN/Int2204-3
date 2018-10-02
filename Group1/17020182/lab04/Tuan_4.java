package lab4;

import java.sql.Time;

public class Tuan_4 {
	
	private int b;

	//tim max a va b
	public static int TimMax2So(int a,int b) {
		if(a > b)
		{
			 return a;
		}
		else if(a < b)
		{
			return b;
		}
		return a;
		
	}
	// De Quy tim min trong mang a[] co n phan tu
	public static int TimMinMang(int a[],int n) {
		if(n==0)
		{
			return 0; //neu n = 0 tra ve 0;
		}
		if(n==1)
		{
			return a[0];// neu n = 1 tra ve phan tu dau tien cua mang
		}
		else {
			if( a[n-1]<TimMinMang(a,n-1)) 
			{
				return a[n-1];
			}
			else
				return TimMinMang(a, n-1);
		}
		/*ban đầu đệ quy chạy từ trên xuống, phân tích thành các bài toán nhỏ nhất,
		 *  đến khi Min(A,1) thì sẽ chạy ngược lên đê so sánh
		 *  
		*/
	}
	public static String BMINguoi(double CanNang,double ChieuCao)
	{
		double BMI = CanNang/(ChieuCao*ChieuCao);
		
		if(BMI < 18.5) {
			
			return "Thiếu cân";
		}
		if(BMI > 18.5 && BMI <23) {
			
			return "Bình thường";
		}
		
		if(BMI > 23 && BMI < 24.99) {
			return "Thừa cân";
		}
		return "Béo phì";
		
		
	}

}
