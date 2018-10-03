public class lab04 {
    public static int findMax (int n1, int n2){
        if (n1>n2)
            return n1;
        else
            return n2;
    }
    
    public static int findMin (int array[]){
        int min= array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min)
                min=array[i];
        }
        return min;
    }
    public static String findBMI (double weight, double height){
        double BMI=(weight)/(height*height);
        if (BMI<18.5)
            return "Thieu can";
        if (BMI<23)
            return "Binh thuong";
        if (BMI<25)
            return "Thua can";
        else
            return "Beo phi";
    }
    public static void main(String[] args) {
        
    }
    
}
