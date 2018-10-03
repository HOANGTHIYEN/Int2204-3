package JavaWeek4;

public class CauB {
	// tìm min của 1 mảng
	public static int minArr(int[] a, int n) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}
}
