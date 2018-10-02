package JavaWeek4;

public class CauA {
	// timfm giá trị lớn nhất giữa 2 số nguyên
	public static int findMax(int num1, int num2) {
		if (num1 == num2)
			return num1;
		else if (num1 > num2)
			return num1;
		else
			return num2;
	}
}
