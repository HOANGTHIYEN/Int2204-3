/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bbmmii.Bbmmii;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MANH HOANG
 */
public class testbbmmii {
    
    public testbbmmii() {
    }
    
    
    @Test
    public void testGTLN1() {
        
        assertEquals(6, Bbmmii.gtln(5,6));
        
    }
    @Test
    public void testGTLN2() {
        
        assertEquals(6, Bbmmii.gtln(5,6));
     
    }
    @Test
    public void testGTLN3() {
        
        assertEquals(6, Bbmmii.gtln(5,6));

    }
    @Test
    public void testGTLN4() {
        
        assertEquals(6, Bbmmii.gtln(5,6));

    }
    @Test
    public void testGTLN5() {
        
        assertEquals(6, Bbmmii.gtln(5,6));
    }

    
    @Test
    public void testMin1() {
        int arr1 [] = { 1 , 2 , 3 };
        assertEquals(1, Bbmmii.gtnn(arr1));
  
    }
    @Test
    public void testMin2() {
        int arr2 [] = { 4 , 2 , 3 };
        assertEquals(2, Bbmmii.gtnn(arr2));

    }
    @Test
    public void testMin3() {
        int arr3 [] = { 4 , 5 , 3 };
        assertEquals(3, Bbmmii.gtnn(arr3));

    }
    @Test
    public void testMin4() {
        int arr4 [] = { 4 , 5 , 6 };
        assertEquals(4, Bbmmii.gtnn(arr4));
    }
    @Test
    public void testMin5() {
        int arr5 [] = { 5 , 6 , 7 };
        assertEquals(5, Bbmmii.gtnn(arr5));
    }

    
    @Test
    public void testBMI1() {
        assertEquals("thieu can", Bbmmii.GT(50, (float) 1.78));
     

    }
    @Test
    public void testBMI2() {

        assertEquals("thieu can", Bbmmii.GT(51, (float) 1.79));


    }
    @Test
    public void testBMI3() {

        assertEquals("binh thuong",Bbmmii.GT(60, (float) 1.66));


    }
    @Test
    public void testBMI4() {

        assertEquals("beo phi",Bbmmii.GT(61, (float) 1.5));


    }
    @Test
    public void testBMI5() {

        assertEquals("thua can", Bbmmii.GT(61, (float) 1.6));

    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
