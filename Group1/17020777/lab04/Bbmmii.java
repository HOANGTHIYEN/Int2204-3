/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbmmii;

/**
 *
 * @author MANH HOANG
 */
public class Bbmmii {

    /**
     * @param args the command line arguments
     */
    
    public static int gtln(int a,int b) {
        if(a>=b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    public static int gtnn(int a[]) {
        int i,min;
        min=a[0];
        for(i=1;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        return min;
    }
    
    
    public static String GT(float can,float cao) {
        float bmi;
        bmi=can/cao/cao;
        if(bmi<18.5)
        {
            return "thieu can";
        }
        else if(bmi>=18.5&&bmi<23)
        {
            return "binh thuong";
        }
        else if(bmi>=23&&bmi<25)
        {
            return "thua can";
        }
        else
        {
            return "beo phi";
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
