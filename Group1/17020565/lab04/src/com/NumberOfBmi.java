package com;

public class NumberOfBmi {

    public static String getResult(double height, double weight){
        double numberBmi = weight / (height * height);
        if(numberBmi > 25) return Bmi.BEO_PHI.toString();
        else if(numberBmi >= 23) return Bmi.THUA_CAN.toString();
        else if(numberBmi >= 18.5) return Bmi.BINH_THUONG.toString();
        else return Bmi.THIEU_CAN.toString();
    }
}
