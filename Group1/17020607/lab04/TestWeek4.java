import Week4.Week4;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
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
public class TestWeek4 {

    public TestWeek4() {
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

    @Test
    public void testBiggest1() {
        int a1 = 1;
        int b1 = 2;
        int rs1 = Week4.Biggest(a1, b1);
        int test1 = 2;
        assertEquals(rs1, test1);
    }

    @Test
    public void testBiggest2() {
        int a2 = 4;
        int b2 = 3;
        int rs2 = Week4.Biggest(a2, b2);
        int test2 = 3;
        assertEquals(rs2, test2);
    }

    @Test
    public void testBiggest3() {
        int a3 = 9;
        int b3 = 9;
        int rs3 = Week4.Biggest(a3, b3);
        int test3 = 6;
        assertEquals(rs3, test3);
    }

    @Test
    public void testBiggest4() {
        int a4 = 7;
        int b4 = 4;
        int rs4 = Week4.Biggest(a4, b4);
        int test4 = 7;
        assertEquals(rs4, test4);
    }

    @Test
    public void testBiggest5() {
        int a5 = 6;
        int b5 = 6;
        int rs5 = Week4.Biggest(a5, b5);
        int test5 = 6;
        assertEquals(rs5, test5);
    }
    @Test
    public void testLowestArr1() {
        int a[] = {1,2,4,7,3,9};
        int rs1 = Week4.Lowest(a);
        int test1 = 1;
        assertEquals(rs1,test1);
        
    }
    @Test
    public void testLowestArr2() {
        int a[] = {6,1,6,9,2,0,4};
        int rs2 = Week4.Lowest(a);
        int test2 = -1;
        assertEquals(rs2,test2);
    }
    @Test
    public void testLowestArr3() {
        int a[] = {-2,-6,0,-3,9,11,99,3};
        int rs3 = Week4.Lowest(a);
        int test3 = -6;
        assertEquals(rs3,test3);
    }
    @Test
    public void testLowestArr4() {
        int a[] = {5,-9,0,-4,-99,99};
        int rs4 = Week4.Lowest(a);
        int test4 = -99;
        assertEquals(rs4,test4);
    }
    @Test
    public void testLowestArr5() {
        int a[] = {1,3,6,2,1,4,5,7,-4};
        int rs5 = Week4.Lowest(a);
        int test5 = -99;
        assertEquals(rs5,test5);
    }
    @Test
    public void testBMI1() {
        double w1 = 56;
        double h1 = 1.83;
        String rs1 = Week4.BMI(w1, h1);
        assertEquals("Thiếu cân", rs1);
    }
    @Test
    public void testBMI2() {
        double w2 = 71;
        double h2 = 1.73;
        String rs2 = Week4.BMI(w2, h2);
        assertNotEquals("Thừa cân", rs2);
    }
    @Test
    public void testBMI3() {
        double w3 = 65;
        double h3 = 1.72;
        String rs3 = Week4.BMI(w3, h3);
        assertEquals("Bình thường", rs3);
    }
    @Test
    public void testBMI4() {
        double w4 = 45;
        double h4 = 1.56;
        String rs4 = Week4.BMI(w4, h4);
        assertEquals("Thừa cân", rs4);
    }
    @Test
    public void testBMI5() {
        double w5 = 90;
        double h5 = 1.83;
        String rs5 = Week4.BMI(w5, h5);
        assertNotEquals("Thiếu cân", rs5);
    }
}