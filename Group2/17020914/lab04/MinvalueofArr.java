/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author admin
 */
public class MinvalueofArr {
    public static int Min_arr(int a[]){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i])min=a[i];
        }
        return min;
    }
}
