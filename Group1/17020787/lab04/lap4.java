package lap44;

public class lap4 {
    public static int max(int a,int b) {
        if(a>b) return a;
        else
            return b;
    }
    public static int MinArray(int[] a) {
        int min=a[0],i;
        for(i=1;i<a.length;i++) {
            if(min>a[i]) min=a[i];

        }
        return min;

    }
    public static String BMI(double weigh,double high) {
        double bmi=weigh/(high*high);
        if(bmi<18.5) return "Thiếu cân";
        else
        if(bmi<=22.99) return"Bình thường";
        else
        if(bmi<=24.99) return "Thừa cân";
        else
            return "Béo phì";
    }

}
