package lab04;

public class ktra {
    // ham tim gia tri lon nhat cua hai so nguyen a va b
	public static int Max(int a, int b) {
		int max = a;
		if(b>a)	max = b;
		return max;
	}
	// ham tim gia tri nho nhat cua mang
	public static int Min(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] < min) {
        		min = arr[i];
        	}
        }
        return min;
    }
	
}
