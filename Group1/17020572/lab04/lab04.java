public class lab04 {
    public  int greaterNum(int a,int b)
    {
        if(a>=b) return a;
        else return b;
    }
    public int minArr(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<= min) min= arr[i];
        }
        return min;
    }
    public String BMI(double hei, int wei)
    {
        double bmi=wei/(hei*hei);
        if(bmi<18.5) return "Thieu Can";
        if(bmi>=18.5 && bmi<=22.99) return "Binh Thuong";
        if(bmi>=23 && bmi<=24.99) return "Thua Can";
        if(bmi>25) return "Beo Phi";
        else return "";
    }

}
