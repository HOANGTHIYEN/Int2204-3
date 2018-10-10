package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(mmax(4,6));
        double[] arr = {2,3,4,5};
        System.out.println(minnGroup(arr));
    }

    public static double mmax(double a, double b) {
        if (a >= b) return a;
        else return b;
    }

    public static double minnGroup(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static String BMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) return ("Thieu can");
        else if ((bmi >= 18.5) && (bmi < 23)) return ("Binh thuong");
        else if (bmi <= 25 && bmi >= 23) return ("Thua can");
        else return ("Beo phi");

    }
}
