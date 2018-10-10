public class tuan4 {
    // Tìm giá tr? l?n nh?t c?a hai s? nguyên
    public int max(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
    // Tìm giá tr? nh? nh?t c?a c?a m?t m?ng s? nguyên
    public int minArr(int[] arr){
        int min = arr[0];
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    // K?t qu? dánh giá ch? s? BMI
    public String BMI( double chieucao, double cannang){
        double bmi = cannang/(chieucao*chieucao);
        if(bmi < 18.5)
            return "Thi?u cân";
        else if (bmi >=18.8 && bmi <= 22.99)
            return "Bình thu?ng";
        else if (bmi >=23 && bmi <=24.99)
            return "Th?a cân";
        else
            return "Béo phì";
    }
}