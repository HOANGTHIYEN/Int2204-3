
package lab004;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class Lab004Test {
    
    public Lab004Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of songuyen method, of class Lab004.
     */
    @Test
    public void testSonguyen1() {
        assertEquals (3 , Lab004.songuyen(2, 3));
    }

    @Test
    public void testSonguyen2() {
        assertEquals (9 , Lab004.songuyen(9, 3));
    }

    @Test
    public void testSonguyen3() {
        assertEquals (3 , Lab004.songuyen(1, 3));
    }

    @Test
    public void testSonguyen4() {
        assertEquals (14 , Lab004.songuyen(2, 14));
    }

    @Test
    public void testSonguyen5() {
        assertEquals (8 , Lab004.songuyen(6,8));
    }

    
    /**
     * Test of mangsonguyen method, of class Lab004.
     */
    @Test
    public void testMangsonguyen1() {
        int ar1[]={1,2,4,5,6};
        assertEquals (1 , Lab004.mangsonguyen(ar1, 5));
    }

    @Test
    public void testMangsonguyen2() {
        int ar2[]={1,2,4,5,6};
        assertEquals (1 , Lab004.mangsonguyen(ar2, 5));
    }

    @Test
    public void testMangsonguyen3() {
        int ar3[]={7,2,4,5,6};
        assertEquals (2 , Lab004.mangsonguyen(ar3, 5));
    }

    @Test
    public void testMangsonguyen4() {
        int ar4[]={9,10,11,5,6};
        assertEquals (5 , Lab004.mangsonguyen(ar4, 5));
    }

    @Test
    public void testMangsonguyen5() {
        int ar5[]={7,8,9,4,5,6};
        assertEquals (4 , Lab004.mangsonguyen(ar5, 6));
    }

    /**
     * Test of BMI method, of class Lab004.
     */
    @Test
    public void testBMI1() {
        assertEquals ("Thiếu cân", Lab004.BMI(37.0, 1.5));
    }
    
    @Test
    public void testBMI2() {
        assertEquals ("Bình thường", Lab004.BMI(45.0, 1.5));
    }
    
    @Test
    public void testBMI3() {
        assertEquals ("Béo phì", Lab004.BMI(70.0, 1.5));
    }

    @Test
    public void testBMI4() {
        assertEquals ("Thừa cân", Lab004.BMI(54.0, 1.5));
    }

    @Test
    public void testBMI5() {
        assertEquals ("Thiếu cân", Lab004.BMI(35.0, 1.5));
    }

}