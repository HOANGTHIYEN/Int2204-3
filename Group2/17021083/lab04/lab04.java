package lab04;

import java.util.Scanner;

public class lab04 
{
	public static int Bigger(int num1, int num2)
	{
		return Math.max(num1,num2);
	}
	public static int Smallest(int a[])
	{
		int kq=a[0];
		for(int i=1;i<a.length;i++)
			kq=Math.min(kq,a[i]);
		return kq;
	}
	public static String BMI(float cannang, float chieucao)
    {
        float bmi = (float) (cannang/(Math.pow(chieucao,2)));
        if(bmi < 18.5)
            return "Thiếu cân";
        if( bmi >= 18.5 && bmi < 23 )
            return "Bình thường";
        if( bmi>=23 && bmi <= 25)
            return "Thừa cân";
        if(bmi>25)
            return "Béo phì";
        return "";
    }
	public static void main(String args[])
    {
		Scanner input=new Scanner(System.in);
		int num1,num2;
        System.out.println("Nhap vao num1, num2: ");
        num1=input.nextInt();
        num2=input.nextInt();
        System.out.println(Bigger(num1,num2));
        System.out.println("Nhập vào độ dài của mảng: ");
        int size= input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) 
            array[i] = input.nextInt();
        System.out.println(Smallest(array));
        System.out.println("Nhap vao chieu cao, can nang: ");
        float h,w;
        h=input.nextFloat();
        w=input.nextFloat();
        System.out.println(BMI(h,w));
    }
}