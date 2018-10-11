public class Lab_04 {
    public static int Max(int a, int b)
    {
        if(a>=b)
            return a;
        else return b;
    }
    public static int Min_arr(int[] arr)
    {
        int min;
        min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
                min =arr[i];
        }
        return min;
    }
    public static String BMI(double chieucao, double cannang)
    {
        double BMI;
        BMI = cannang/(chieucao*chieucao);
        if(BMI<18.5)
            return "Thieu can";
        else if(BMI>=18.5&&BMI<23)
            return "Binh thuong";
        else if (BMI>=23&&BMI<25)
            return "Thua can";
        else 
            return "Beo phi";
    }
}