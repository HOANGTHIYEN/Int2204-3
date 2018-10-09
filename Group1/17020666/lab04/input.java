package com.lab04;

public class input {
	public static int soNlonN(int a,int b) {
		int max=a;
		if(max<b) max=b;
		return max;
	}
	public static int soNnhoN(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) min=arr[i];
		}
		return min;
	}
	public static String indexBMI(double weight, double height) {
		double bmi=weight/(height*height);
		if(bmi<18.5) return "Thiếu cân";
		else if(bmi>=18.5 && bmi<23) return "Bình thường";
		else if(bmi>=23 && bmi<=24.99) return "Thừa cân";
		else return "Béo phì";
		
	}

}