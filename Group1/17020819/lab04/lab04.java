public class lab04 {

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int minArray(int[] arr,int size) {
        int i;

        int min = arr[0];

        for (i = 1; i < size; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static String BMI(double weight, double height) {
        int h = (int) (height*100);
        int w = (int) (weight*10000);
        int BMI = w / (h * h );

        if (BMI < 18.5)
            return "Thieu can";
        else if (BMI >= 18.5 && BMI <23)
            return "Binh thuong";
        else if (BMI >= 23 && BMI < 24.99)
            return "Thua can";
        return "Beo phi";
    }

    public static void main(String[] args) {

        int a=0, b=2;
        int[] arr = {1,2,3};
        double height= 1.58,weight=57;
        System.out.println("Gia tri lon nhat la : " + max(a, b) + "\n----------------------");
        System.out.println("Gia tri nho nhat cua mang la : " + minArray(arr,3) + "\n----------------------");
        System.out.println("Ket qua BMI : " + BMI(weight,height));


    }
}
