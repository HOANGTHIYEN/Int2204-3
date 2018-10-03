package pk;

public class ham {
	public static void main(String[] args){
		System.out.println("");
	}
	public static int Max(int a, int b) {
		if (a >= b)
			return a;
		else
			return b;
	}

	public static int Min(int a[], int n) {
		int min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}

	public static String BMI (double h, double m) {
		double bmi = m / h / h;
		if(bmi < 18.5)
        {
            return"Thieu can";
        }
        else if(bmi>=18.5 && bmi<23) 
        {
            return"Binh thuong";
        }
        else if(bmi>=23 && bmi<=24.99)
        {
            return"Thua can";
        }
        else return"Beo phi";

	}
}
