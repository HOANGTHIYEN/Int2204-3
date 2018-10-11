
package week4;

public class Week4 {
    
 public static int TimMax(int a,int b)
{
   if(a>b) return a;
   else return b;
}
    public static int TimMin(int [] arr)
{
   int minn=arr[0];
   for(int i=1;i<arr.length;i++)
   {
       if(minn>arr[i]) minn=arr[i];
   }
   return minn;
   
}
    public static String BMI(double w,double h)
    {
        double dapso=w/(h*h);
        String ketqua="";
         if(dapso<18.5) ketqua="Thiếu cân";
         if(dapso<23 &&dapso>=18.5) ketqua="Bình thường";
           if(dapso<25 &&dapso>=23) ketqua="Thừa cân";
             if(dapso>=25) ketqua="Béo phì";
         
        return ketqua;
        
    }
}
