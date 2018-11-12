/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap10_cau2;

import static java.lang.Math.random;

/**
 *
 * @author Nguyễn Thái
 */
public class Bai_Tap_Lap10_Cau2 {

    public static double[] sort(double[] array){
        double temp;
        for(int i = 0;i < array.length;i ++)
            for(int j = i+1;j < array.length; j ++)
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        return array;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arr = new double[1000];
        for(int i = 0;i < 1000;i ++)
            arr[i] = random()*1000;
            arr = sort(arr);
        for(int i = 0;i < 1000;i ++)
            System.out.println(arr[i]);
    }
    
}
