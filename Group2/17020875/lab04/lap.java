public class lab {
    public static int findMax(int a, int b)
    {
        return a > b ? a : b;
    }
    public static int findMinArray(int a[])
    {
        int i;
        int n = a.length;
        int min = a[0];
        for(i = 1; i < n; i++)
        {
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static String calBMI(double weight, double high)
    {

        double BMI = weight / (high * high);
        String s1 = "Thi?u c�n";
        String s2 = "B�nh thu?ng";
        String s3 = "Th?a c�n";
        String s4 = "B�o ph�";

        if(BMI < 18.5)
            return s1;
        else if(BMI < 23)
            return s2;
        else if(BMI < 25)
            return s3;
        else
            return s4;


    }

}
