/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import junit.framework.TestCase;

/**
 *
 * @author TuanBac
 */
public class Week4Test extends TestCase {
    
    public Week4Test(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

   
    
    public void testTimMax() {
        
        int a = 1;
        int b = 2;
        Week4 instance = new Week4();
        int expResult = 1;
        int result = instance.TimMax(a, b);
        assertEquals(expResult, result);
       
    }

    
    public void testTimMin() {
       
        int[] arr = {5,2,4,8,5,6,5};
        Week4 instance = new Week4();
        int expResult = 2;
        int result = instance.TimMin(arr);
        assertEquals(expResult, result);
       
    }

    
    public void testBMI() {
        
        double w = 60;
        double h = 2;
        Week4 instance = new Week4();
        String  result = instance.BMI(w, h);
        assertEquals("Thiếu cân", result);
        
       
    }
    
    public void testTimMax2() {
       
        int a = 5;
        int b = 6;
        Week4 instance = new Week4();
        int expResult = 6;
        int result = instance.TimMax(a, b);
        assertEquals(expResult, result);
       
    }

    
    public void testTimMin2() {
        
        int[] arr = {5,-5,4,9,5,6,5};
        Week4 instance = new Week4();
        int expResult = 2;
        int result = instance.TimMin(arr);
        assertEquals(expResult, result);
       
    }

    
    public void testBMI2() {
      
        double w = 70;
        double h = 5;
        Week4 instance = new Week4();
        String  result = instance.BMI(w, h);
        assertEquals("Thiếu cân", result);
        
       
    }
    
    public void testTimMax3() {
        
        int a = 80;
        int b = 5;
        Week4 instance = new Week4();
        int expResult = 5;
        int result = instance.TimMax(a, b);
        assertEquals(expResult, result);
       
    }

    
    public void testTimMin3() {
       
        int[] arr = {1,2,3,4,5,6,7};
        
        int expResult = 1;
        int result = Week4.TimMin(arr);
        assertEquals(expResult, result);
       
    }

    
    public void testBMI3() {
       
        double w = 65;
        double h = 4;
        Week4 instance = new Week4();
        String  result = instance.BMI(w, h);
        assertEquals("Thiếu cân", result);
        
       
    }
    
    public void testTimMax4() {
       
        int a = 1;
        int b = 1;
        Week4 instance = new Week4();
        int expResult = 1;
        int result = instance.TimMax(a, b);
        assertEquals(expResult, result);
       
    }

    
    public void testTimMin4() {
       
        int[] arr = {5,2,4,8,5,6,5};
        Week4 instance = new Week4();
        int expResult = 2;
        int result = instance.TimMin(arr);
        assertEquals(expResult, result);
       
    }

    
    public void testBMI4() {
       
        double w = 40;
        double h = 5;
        Week4 instance = new Week4();
        String  result = instance.BMI(w, h);
        assertEquals("Thiếu cân", result);
        
       
    }
    
    public void testTimMax5() {
      
        int a = 0;
        int b = 6;
        Week4 instance = new Week4();
        int expResult = 0;
        int result = instance.TimMax(a, b);
        assertEquals(expResult, result);
       
    }

    
    public void testTimMin5() {
       
        int[] arr = {5,4,5,5,6,5};
        Week4 instance = new Week4();
        int expResult = 45;
        int result = instance.TimMin(arr);
        assertEquals(expResult, result);
       
    }

    
    public void testBMI5() {
        
        double w = 80;
        double h = 10;
        Week4 instance = new Week4();
        String  result = instance.BMI(w, h);
        assertEquals("Béo phì", result);
        
       
    }
    
}