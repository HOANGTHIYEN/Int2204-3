package mang;
import java.util.ArrayList;
import java.util.Scanner;



public class Mang {
 static Scanner input=new Scanner(System.in);
double c;
double b;
double nang;

double cao;


        

static String bmi(double nang, double cao)
{String thieu="thieu can";
String binh="binh thuong";
String thua="thua can";
String beo="beo phi";
String kq = null;

       
    double bmi=nang/(cao*cao);
    if(bmi<18.5)
    {
      kq = thieu;
    }
    else
        
    {
        if(bmi>=18.5&&bmi<23)
        {
            kq = binh;
        }
        else
        {
            if(bmi>=23&&bmi<=25)
            {
               kq = thua;
            }
            else
            {
             if(bmi>25 )
                
             { kq=beo;
                 
             }    
                
            }
        }
    }
    return kq;
}


static double sosanh(double c,double b)
{
    if(c>b)
    {
        return c;
    }
    else
    {
        return b;
    }
}
static int nvs(int a[],int n)
        
{int min=a[0];
for(int i=1;i<n;i++)
{
    if(a[i]<min)
    {
        min=a[i];
    }
}
return min;

}
       public static void main(String[] args) 
    { 
        Mang d=new Mang();
      
     
        

      
     
             
     
        
        
        
    }

    Object bmi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

  
    
}

