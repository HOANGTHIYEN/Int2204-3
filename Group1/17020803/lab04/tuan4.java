public class tuan4 {
    // T�m gi� tr? l?n nh?t c?a hai s? nguy�n
    public int max(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
    // T�m gi� tr? nh? nh?t c?a c?a m?t m?ng s? nguy�n
    public int minArr(int[] arr){
        int min = arr[0];
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    // K?t qu? d�nh gi� ch? s? BMI
    public String BMI( double chieucao, double cannang){
        double bmi = cannang/(chieucao*chieucao);
        if(bmi < 18.5)
            return "Thi?u c�n";
        else if (bmi >=18.8 && bmi <= 22.99)
            return "B�nh thu?ng";
        else if (bmi >=23 && bmi <=24.99)
            return "Th?a c�n";
        else
            return "B�o ph�";
    }
}