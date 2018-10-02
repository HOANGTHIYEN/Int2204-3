public class lab04 {

    public static int valueMax(int a, int b){
        if(a>=b)
            return a;
        else return b;
    }

    public static int valueMinOfArray(int[] arr){
        int min = arr[0];
        for(int i =1 ; i< arr.length; i++){
            if(min>=arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static String BMI(float weight, float height){
        float BMI = weight/(height*height);
        if(BMI < 18.5) {
            return "Thiếu cân";
        } else if(BMI >= 18.5 && BMI < 23) {
            return "Bình thường";
        } else if(BMI >= 23 && BMI < 25) {
            return "Thừa cân";
        }  else {
            return "Béo phì";
        }
    }

}
