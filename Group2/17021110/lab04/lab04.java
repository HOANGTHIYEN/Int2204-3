package lab04;

public class Lab04 {
    public static int solon(int a,int b){
        if(a>=b)
            return a;
        else
            return b;
    }
    public static int searchMin(int[] arr){
		int min = arr[0];
		for(int i = 1;i < arr.length;i ++)
			if(arr[i] < min)
				min = arr[i];
		return min;
	}
    public static String BMI(double weight, double high) {
		double bmi = weight/(high*high);
		if(bmi < 18.5)
			return "Thieu can";
		else if(bmi <23)
			return "Binh thuong";
		else if(bmi <25)
			return "Thua can";
                else return "Beo phi";
	}
}