import java.util.Arrays;

public class MMB {
	public static int Max(int a, int b) {
		if (b > a) {
			return b;
		}
		return a;
		
	}
	public static int Min(int [] arr) {
		int min = arr[0] ;
		for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
		return min;	
	}
	
	public static String BMI(double cannang,double chieucao) {
		double bmi =  cannang / (chieucao*chieucao);
		if (bmi<18.5) {
			return "Thieu Can";
		}
		if (bmi>=18.5 && bmi<23) {
			return "Binh Thuong";
		}
		if(bmi>=23 && bmi<25) {
			return "Thua can";
		}
		if(bmi>=25){
			return "Beo phi";
		}
	}
}