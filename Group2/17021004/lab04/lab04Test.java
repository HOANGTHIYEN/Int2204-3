import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hoangson
 */
public class lab04Test {
    
    public lab04Test() {
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
     * Test of main method, of class lab04.
     */
    @Test
    public void testFindMax(){
        int n1=1;
        int n2=2;
        int result = lab04.findMax(n1, n2);
        assertEquals(2, result);
    }
    @Test
    public void testFindMax2(){
        int n3=2;
        int n4=3;
        int result2 = lab04.findMax(n3, n4);
        assertEquals(3,result2);

    }
    @Test
    public void testFindMax3(){
        int n1=3;
        int n2=4;
        int result = lab04.findMax(n1, n2);
        assertEquals(4, result);
    }
    @Test
    public void testFindMax4(){
        int n1=4;
        int n2=5;
        int result = lab04.findMax(n1, n2);
        assertEquals(5, result);
    }
    @Test
    public void testFindMa5(){
        int n1=5;
        int n2=6;
        int result = lab04.findMax(n1, n2);
        assertEquals(6, result);
    }

    @Test
    public void testFindMin(){
        int[] array={6,2,2,3,4,5};
        int result= lab04.findMin(array);
        assertEquals(2,result);
    }
     @Test
    public void testFindMin2(){
        int[] array={2,6,7,3,4,5,8};
        int result= lab04.findMin(array);
        assertEquals(2,result);
    }
    @Test
    public void testFindMin3(){
        int[] array={6,10,9,6,4,3};
        int result= lab04.findMin(array);
        assertEquals(3,result);
    }
    @Test
    public void testFindMin4(){
        int[] array={6,12,21,3,4,5};
        int result= lab04.findMin(array);
        assertEquals(3,result);
    }
    @Test
    public void testFindMin5(){
        int[] array={16,22,24,33,4,15};
        int result= lab04.findMin(array);
        assertEquals(4,result);
    }
    @Test
    public void testFindBMI(){
        double h=1.9;
        double w=50.0;
        String rerult= lab04.findBMI(w,h );
        String expResult="Thieu can";
        assertEquals(expResult, rerult);
    }
        @Test
    public void testFindBMI2(){
        double h=1.56;
        double w=41.0;
        String rerult= lab04.findBMI(w,h );
        String expResult="Thieu can";
        assertEquals(expResult, rerult);
    }
    @Test
    public void testFindBMI3(){
        double h=1.8;
        double w=60.0;
        String rerult= lab04.findBMI(w,h );
        String expResult="Binh thuong";
        assertEquals(expResult, rerult);
    }
    @Test
    public void testFindBMI4(){
        double h=1.2;
        double w=40.0;
        String rerult= lab04.findBMI(w,h );
        String expResult="Beo phi";
        assertEquals(expResult, rerult);
    }
    @Test
    public void testFindBMI5(){
        double h=1.7;
        double w=60;
        String rerult= lab04.findBMI(w,h );
        String expResult="Binh thuong";
        assertEquals(expResult, rerult);
    }

    
}
