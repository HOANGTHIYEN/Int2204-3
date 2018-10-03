import java.util.Scanner;
public class lab04 {
        public static int max(int a, int b) {
            int Max = a;
            if (a < b)
                Max = b;
            return Max;
        }

    public static int arrayMin(int[] arr) {
            int Min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < Min)
                    Min = arr[i];
            }
            return Min;
        }

        public static String BMI(double kg, double m) {
            double BMI = kg / (m * m);
            String str = null;
            if (BMI < 18.5)
                str = "Thiếu cân";
            if (BMI >= 18.5 && BMI < 23)
                str = "Bình thường";
            if (BMI >= 23 && BMI < 25)
                str = "Thừa cân";
            if (BMI >= 25)
                str = "Béo phì";
            return str;
        }

        public static void main(String[] args) {
            // TODO code application logic here
            Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(max(a, b));

//        int[] arr = new int[100];
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        n = arr.length;
//        System.out.println(arrayMin(arr));

            float kg = sc.nextFloat();
            float m = sc.nextFloat();
            System.out.println(BMI(kg, m));
        }
}
