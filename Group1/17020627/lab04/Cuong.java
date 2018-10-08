
 
package cuong;

public class Cuong {

    public static void main(String[] args) {
       
    }
    public static int MaxInt(int a, int b) {
        int temp;
        if (a>b) 
            temp=a;
        else 
            temp=b;
    return temp;
    }
    
   
    public static int minArr(int A[],int n) {
      int Min=0;
        if (A.length>0) {
         Min=A[0];
        for (int i=1;i<n;i++)
            if (A[i]<Min) Min=A[i];
        }   
        return Min;
    }
    
    public static String BMI(double Wei, double Hei) {
        String S1="Thieu can", S2="Binh thuong", S3="Thua can", S4="Beo phi",S="";
        double temp;
        temp=Wei/(Hei*Hei);
        if (temp<18.5) S=S1;
        else if (temp<22.99) S=S2;
        else if (temp<24.99) S=S3;
        else if (temp>=25) S=S4;
        return S;
    }
    
}

