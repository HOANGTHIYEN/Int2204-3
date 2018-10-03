package anily.com;

public class Ham {
	public static int timMax (int a ,int b )
	{
		return Math.max(a,b);
		
	}
	public static int soNhoNhatCuaMang (int arr[])
	{
		
		int min = arr[0];
		for (int i = 0 ;i< arr.length;i++)
		{
			if (arr[i] <min)
				min = arr[i];
		}
		return min ;
			
	}
	public static String  tinhTrang (double canNang, double chieuCao)
	{
		double BMI = canNang/(Math.pow(chieuCao,2));
		if (BMI <18.5)
			 return "Thiếu Cân";
		else if (18.5 <= BMI && BMI<22.99)
			return "Bình Thường";
		else if (23<= BMI && BMI <25)
			return "Thừa Cân";
		else 
			return "Béo Phì";
		
	}
}
