import org.junit.Test;
import static org.junit.Assert.*;
public class Lab_04Test {
    
    public Lab_04Test() {
    }

    @Test
    public void Max1() {
        Lab_04 test = new Lab_04();
        int a1 = test.Max(1,5);
        assertEquals(5, a1);
    }
    @Test
    public void Max2(){
        Lab_04 test = new Lab_04();
        int a2 = test.Max(0,9);
        assertEquals(9, a2);
    }
    @Test
    public void Max3(){
        Lab_04 test = new Lab_04();
        int a3 = test.Max(-15,5);
        assertEquals(5, a3);
    }
    @Test
    public void Max4(){
        Lab_04 test = new Lab_04();
        int a4 = test.Max(11,25);
        assertEquals(25, a4);
    }
    @Test
    public void Max5(){
        Lab_04 test = new Lab_04();
        int a5 = test.Max(147,5);
        assertEquals(147, a5);
    }
    @Test
    public void Min_arr1()
    {
        Lab_04 test = new Lab_04();
        int[] a = {0,1,2,3,4};
        int b1 = test.Min_arr(a);
        assertEquals(0, b1);    
    }
    @Test
    public void Min_arr2()
    {
        Lab_04 test = new Lab_04();
        int[] b = {15,18};
        int b2 = test.Min_arr(b);
        assertEquals(15, b2);
    }
    @Test
    public void Min_arr3()
    {
        Lab_04 test = new Lab_04();
        int[] c = {-158,48,41,-147};
        int b3 = test.Min_arr(c);
        assertEquals(-158, b3);
    }
    @Test
    public void Min_arr4()
    {
        Lab_04 test = new Lab_04();
        int[] d = {52,14,15,12};
        int b4 = test.Min_arr(d);
        assertEquals(12, b4);
    }
    @Test
    public void Min_arr5()
    {
        Lab_04 test = new Lab_04();
        int[] e = {15,48,5618,1515};
        int b5 = test.Min_arr(e);
        assertEquals(15, b5);
    }
    @Test
    public void BMI1()
    {
        Lab_04 test = new Lab_04();
        String s1 = test.BMI((float) 1.78,60);
        assertEquals("Binh thuong",s1);
    }
    @Test
    public void BMI2()
    {
        Lab_04 test = new Lab_04();
        String s2 = test.BMI((float) 1.65,70);
        assertEquals("Beo phi",s2);
    }
    @Test
    public void BMI3()
    {
        Lab_04 test = new Lab_04();
        String s3 = test.BMI((float) 1.8,50);
        assertEquals("Thieu can",s3);
    }
    @Test
    public void BMI4()
    {
        Lab_04 test = new Lab_04();
        String s4 = test.BMI((float) 1.6,62);
        assertEquals("Thua can",s4);
    }
    @Test
    public void BMI5()
    {
        Lab_04 test = new Lab_04();
         String s5 = test.BMI((float) 1.53,45);
        assertEquals("Binh thuong",s5);
    }
}