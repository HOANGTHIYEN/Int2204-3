package lab04.java;
 public class Lab04 {
     //Ham tim gia tri lon nhat cua hai so nguyen
    public static int findMaxInt(int a, int b) {
        int temp;
        if (a>b) 
            temp=a;
        else 
            temp=b;
    return temp;
    }
    
    //Ham tim gia tri nho nhat cua mang
    public static int findMinA(int A[], int n) {
        int Min=0;
        if (A.length>0) {
        Min=A[0];
        for (int i=1;i<n;i++)
            if (A[i]<Min) Min=A[i];
        }   
        return Min;
    }
    
    //Ham tinh chi so BMI
    public static String BMI(float Wei, float Hei) {
        String S1="Thieu can", S2="Binh thuong", S3="Thua can", S4="Beo phi",S="";
        float temp;
        temp=Wei/(Hei*Hei);
        if (temp<18.5) S=S1;
        else if (temp<22.99) S=S2;
        else if (temp<24.99) S=S3;
        else if (temp>=25) S=S4;
        return S;
    }
    
}