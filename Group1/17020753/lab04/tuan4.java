package tuan4;

public class tuan4 {

	public static int GTLN(int a, int b) {
		if (a == b)
			return a;
		if (a < b) {
			return b;
		} else {
			return a;
		}
	}

	public static int GTNN(int a[], int n) {
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static String BMI(double weight, double height) {
		double bmi = weight / (height * height);
		if (bmi < 18.5) {
			return "Thiếu cân";
		} else {
			if (bmi < 23) {
				return "Bình thường";
			} else {
				if (bmi < 25) {
					return "Thừa cân";
				} else {
					return "Béo phì";
				}
			}
		}
	}
}
