/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author Admin
 */
public class tuan4 {
    // TÃ¬m giÃ¡ trá»‹ lá»›n nháº¥t cá»§a hai sá»‘ nguyÃªn
    public int max(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
    // TÃ¬m giÃ¡ trá»‹ nhá»� nháº¥t cá»§a cá»§a má»™t máº£ng sá»‘ nguyÃªn
    public int minArr(int[] arr){
        int min = arr[0];
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    // Káº¿t quáº£ Ä‘Ã¡nh giÃ¡ chá»‰ sá»‘ BMI
    public String BMI( double chieucao, double cannang){
        double bmi = cannang/(chieucao*chieucao);
        if(bmi < 18.5)
            return "Thiếu cân";
        else if (bmi >=18.8 && bmi <= 22.99)
            return "Bình thường";
        else if (bmi >=23 && bmi <=24.99)
            return "Thừa cân";
        else
            return "Béo phì";
    }

}
