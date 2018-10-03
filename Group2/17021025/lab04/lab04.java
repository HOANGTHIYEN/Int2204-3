package lab04;

public class lab04
{
    public static int findmax(int a, int b) //tìm số lớn hơn trong 2 số nguyên
    {
        if(a>b)
            return a;
        return b;
    }

    public static int minarray(int a[])
    {
        int i,min=a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
    public static String BMI(float cannang, float chieucao)
    {
        float bmi = (float) (cannang/(Math.pow(chieucao,2)));
        if(bmi < 18.5)
            return "Thiếu cân";
        else if( bmi >= 18.5 && bmi <= 22.995 )
            return "Bình thường";
        else if( bmi>=23 && bmi <= 24.99)
            return "Thừa cân";
        else if(bmi>25)
            return "Béo phì";
        return "";
    }
}
