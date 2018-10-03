package lab004;
public class Lab004 {

    //tìm giá trị lớn nhất của 2 số nguyên
    public static int songuyen(int a,int b){
        return Math.max(a,b);
    }
    
    //tìm giá trị nhỏ nhất của mảng số nguyên
    public static int mangsonguyen(int a[],int n){
        int amin = a[0];
        for(int i=0; i<n; i++){
            if(a[i]<amin){
                amin=a[i];
            }
        }
        return amin;
    }
    
    //BMI
    public static String BMI(double cannang, double chieucao){
        double BMI= cannang/(chieucao*chieucao);
        if(BMI<18.5){
            return ("Thiếu cân");
        }
        else if(BMI>=18.5&&BMI<=22.99){
            return ("Bình thường");
        }
        else if(BMI>=23&&BMI<=24.99){
            return ("Thừa cân");
        }
        else{
            return ("Béo phì");
        
    }
    }
}