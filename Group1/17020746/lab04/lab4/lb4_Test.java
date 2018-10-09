import lab4.lb4;
import org.junit.Assert;
import org.junit.Test;

public class lb4_Test {
    lb4 test = new lb4();
    @Test
    public void testmax1() {
        Assert.assertEquals(6, test.max_int(6, 5));
    }

    @Test
    public void testmax2() {
        Assert.assertEquals(4, test.max_int(2, 4));
    }

    @Test
    public void testmax3() {
        Assert.assertEquals(7, test.max_int(5, 7));
    }

    @Test
    public void testmax4() {
        Assert.assertEquals(8, test.max_int(7, 8));
    }

    @Test
    public void testmax5() {
        Assert.assertEquals(5, test.max_int(2, 5));
    }

    @Test
    public void testarr1() {
        int arr[] = {8, 9, 3, 2};
        Assert.assertEquals(2, test.min_arr(arr));
    }

    @Test
    public void testarr2() {
        int arr[] = {9, -102, 3, 2, 7,23};
        Assert.assertEquals(-102, test.min_arr(arr));
    }

    @Test
    public void testarr3() {
        int arr[] = {9, -100, 3, 2, 7, 23, 5, 9};
        Assert.assertEquals(-100, test.min_arr(arr));
    }

    @Test
    public void testarr4() {
        int arr[] = {102, 100, 3, 2, 7, 4, 3, -100, 10, 6};
        Assert.assertEquals(-100, test.min_arr(arr));
    }

    @Test
    public void testarr5() {
        int arr[] = {2, 3, 3, 7};
        Assert.assertEquals(2, test.min_arr(arr));
    }

    @Test
    public void testbmi1() {
        Assert.assertEquals("Thiếu cân", test.BMI(54, 1.76));
    }

    @Test
    public void testbmi2() {
        Assert.assertEquals("Bình thường", test.BMI(61, 1.76));
    }

    @Test
    public void testbmi3() {
        Assert.assertEquals("Thừa cân", test.BMI(73, 1.76));
    }

    @Test
    public void testbmi4() {
        Assert.assertEquals("Béo phì", test.BMI(456, 1.76));
    }

    @Test
    public void testbmi5() {
        Assert.assertEquals("Béo phì", test.BMI(547, 3.36));
    }
}
