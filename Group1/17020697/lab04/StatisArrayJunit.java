package lab_04_testJunit;


public class StatisArrayJunit {
	public static int Compare(int a,int b) {
		if(a<b) {
			return b;
		}
		return a;
	}
	
	public static int MinArray(int a[],int size) {
		int tmp = a[0];
		for(int i=1;i<size;i++) {
			if(a[i]< tmp) {
				tmp = a[i];
			}
		}
		return tmp;
	}
	
	public static String BMI(double weight,double height){
		double vBMI = weight / (height*height);
		System.out.println(vBMI);
		if(vBMI < 18.5) {
			return "Thieu can";
		} else if (vBMI >=18.5 && vBMI <=23) {
			return "Binh thuong";
		} else if(vBMI > 23 && vBMI <= 24.99) {
			return "Thua can";
		} else {
			return "Beo phi";
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
