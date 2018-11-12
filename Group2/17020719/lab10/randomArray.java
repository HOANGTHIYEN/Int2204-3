import java.util.Random;

public class randomArray {
    protected static int n = 1000;

    public double[] inputRandomArray(){
        double[] randomArr = new double[n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            randomArr[i] = random.nextDouble();
        }
        return randomArr;
    }

    public void outputSortedArray(double[] randomArr){
        for(int i = 0; i < n; i++){
            System.out.println(i + ". " + randomArr[i] + " ");
        }
    }

    public void sortedArray(double[] randomArr){
        for(int i = 0; i < n - 1; i++){
            for(int j = n - 1; j > i; j--){
                if(randomArr[j - 1] > randomArr[j]){
                    double temp = randomArr[j - 1];
                    randomArr[j - 1] = randomArr[j];
                    randomArr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        randomArray array = new randomArray();
        try {
            double[] list = array.inputRandomArray();
            array.sortedArray(list);
            array.outputSortedArray(list);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
