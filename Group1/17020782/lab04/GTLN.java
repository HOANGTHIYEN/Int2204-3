
public class GTLN {

static int[] arr;
static int max(int a,int b)
{
if(a>b)
return a;
else return b;
}
static int min(int[] arr)
{
int min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]<min)
min=arr[i];
}
return min;
}

static String BMI(float a,float b)
{
float c=a/b/b;
if(c<18.5)
{
String t="Thieu can";
return t;
}
else if(18.5<=c && c<=24.99)
{
String bt="Binh thuong";
return bt;
}
else if(c>=23 && c<=24.99)
{
String tc="Thua can";
return tc;
}
else 
{
String bp="Beo phi";
return bp;
}
}
public static void main(String[] args)
{
	System.out.println("5");
}

}