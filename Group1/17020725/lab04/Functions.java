/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap04;

/**
 *
 * @author Administrator
 */
public class Functions {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int minOfArray(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static String BMI(double weight, double height) {
        double BMI = weight / (height * height);
        if (BMI > 25.0) {
            return "Béo phì";
        } else if (BMI >= 23.0) {
            return "Thừa cân";
        } else {
            return BMI >= 18.5 ? "Bình thường" : "Thiếu cân";
        }
    }
}
