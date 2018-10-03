package JavaWeek4;

public class CauC {
	public static String testBMI(double weight, double height) {
		double BMI = weight / (height * height);
		if (BMI < 18.5)
			return "Thiếu Cân";
		else if (23 > BMI && BMI >= 18.5)
			return "Bình Thường";
		else if (24.99 > BMI && BMI >= 23)
			return "Thừa Cân";
		else
			return "Béo Phì";
	}
}
