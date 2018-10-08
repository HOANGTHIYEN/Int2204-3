package lab04;

public class BMI {
	public static String tinhBMI(double w, double h) {
		double BMI;
		BMI = w/(h*h);
		if(BMI < 18.5)	return "Thieu can";
		else if(BMI >=18.5 && BMI < 23)	return "Binh thuong";
		else if(BMI >=23 && BMI <25)	return "Thua can";
		else if(BMI >=25 )	return "Beo phi";
		return null;
		
	}
}
