package com;

public class PracticeB {

    public static int getMinValue(int[] arrayList){
        int temp = Integer.MAX_VALUE;
        for(Integer value : arrayList){
            if(value.intValue() < temp){
                temp = value.intValue();
            }
        }
        return temp;
    }
}
