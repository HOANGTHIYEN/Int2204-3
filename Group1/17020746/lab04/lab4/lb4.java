package lab4;

public class lb4 {
    public int max_int(int x, int y)
    {
        if(x > y) return x;
        return y;
    }

    public int min_arr(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public String BMI(double weight, double height)
    {
        double BMI = weight/(height*height);
        if(BMI < 18.5) return "Thiếu cân";
        else if(18.5 <= BMI && BMI <= 23) return "Bình thường";
        else if(23 < BMI && BMI <= 24.99) return "Thừa cân";
        else return "Béo phì";
    }

}
