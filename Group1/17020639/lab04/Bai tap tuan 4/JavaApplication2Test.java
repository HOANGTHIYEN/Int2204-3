package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaApplication2Test {
    
    @Test
    public void testGTLN1() {
        
        assertEquals(6, JavaApplication2.GTLN(5,6));
        
    }
    @Test
    public void testGTLN2() {
        
        assertEquals(51, JavaApplication2.GTLN(17,51));
     
    }
    @Test
    public void testGTLN3() {
        
        assertEquals(1, JavaApplication2.GTLN(0,1));

    }
    @Test
    public void testGTLN4() {
        
        assertEquals(2, JavaApplication2.GTLN(-13,2));

    }
    @Test
    public void testGTLN5() {
        
        assertEquals(-12, JavaApplication2.GTLN(-15,-12));
    }

    
    @Test
    public void testMin1() {
         assertEquals(1, JavaApplication2.Min(new int[]{1,2,3}));
  
    }
    @Test
    public void testMin2() {

         assertEquals(2, JavaApplication2.Min(new int[]{3,5,2,6}));

    }
    @Test
    public void testMin3() {
         assertEquals(3, JavaApplication2.Min(new int[]{421,51,3,67}));

    }
    @Test
    public void testMin4() {

         assertEquals(1, JavaApplication2.Min(new int[]{51,61,7,1}));

    }
    @Test
    public void testMin5() {

         assertEquals(7, JavaApplication2.Min(new int[]{92,8,15,7}));
    }

    
    @Test
    public void testBMI1() {
        assertEquals("Thừa cân",JavaApplication2.BMI(60, 1.58));
     

    }
    @Test
    public void testBMI2() {

        assertEquals("Thiếu cân",JavaApplication2.BMI(50, 1.7));


    }
    @Test
    public void testBMI3() {

        assertEquals("Bình thường",JavaApplication2.BMI(60, 1.66));


    }
    @Test
    public void testBMI4() {

        assertEquals("Béo phì",JavaApplication2.BMI(61, 1.5));


    }
    @Test
    public void testBMI5() {

        assertEquals("Béo phì",JavaApplication2.BMI(70, 1.6));

    }
    
    
}
