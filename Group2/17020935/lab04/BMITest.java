
package lab4;

import org.junit.Test;
import static org.junit.Assert.*;


public class BMITest {
    
    
    @Test
    public void testBMI1() {
        System.out.println("test_1");
        double height = 1.7;
        double weight = 30;
        String sureResult = "Thieu can";
        String result = BMI.calculateBMI(height, weight);
        assertEquals(sureResult, result);
        
    }
    @Test
    public void testBMI2() {
        System.out.println("test_2");
        double height = 1.8;
        double weight = 65;
        String sureResult = "Binh thuong";
        String result = BMI.calculateBMI(height, weight);
        assertEquals(sureResult, result);
        
    }
    @Test
    public void testBMI3() {
        System.out.println("test_3");
        double height = 1.3;
        double weight = 100;
        String sureResult = "Beo phi";
        String result = BMI.calculateBMI(height, weight);
        assertEquals(sureResult, result);
        
    }
    @Test
    public void testBMI4() {
        System.out.println("test_4");
        double height = 1.9;
        double weight = 90;
        String sureResult = "Thua can";
        String result = BMI.calculateBMI(height, weight);
        assertEquals(sureResult, result);
        
    }
    @Test
    public void testBMI5() {
        System.out.println("test_5");
        double height = 1.6;
        double weight = 500;
        String sureResult = "Beo phi";
        String result = BMI.calculateBMI(height, weight);
        assertEquals(sureResult, result);
        
    }
}
