/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class BMITest {
    
    
    @Test
    public void testCalcuBMI1() {
        System.out.println("test_1");
        double height = 1.7;
        double weight = 40;
        String expResult = "Thieu can";
        String result = BMI.calcuBMI(height, weight);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcuBMI2() {
        System.out.println("test_2");
        double height = 1.78;
        double weight = 66.3;
        String expResult = "Binh thuong";
        String result = BMI.calcuBMI(height, weight);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcuBMI3() {
        System.out.println("test_3");
        double height = 1.5;
        double weight = 60;
        String expResult = "Beo phi";
        String result = BMI.calcuBMI(height, weight);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcuBMI4() {
        System.out.println("test_4");
        double height = 2;
        double weight = 95;
        String expResult = "Thua can";
        String result = BMI.calcuBMI(height, weight);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcuBMI5() {
        System.out.println("test_5");
        double height = 1.2;
        double weight = 30;
        String expResult = "Binh thuong";
        String result = BMI.calcuBMI(height, weight);
        assertEquals(expResult, result);
        
    }
}
