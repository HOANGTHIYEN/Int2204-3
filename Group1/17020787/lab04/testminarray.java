package lap44;

import org.junit.Assert;
import org.junit.Test;

public class testminarray {
    lap4 a = new lap4();
    @Test
    public void lap4minArraytest0() {
        int k[] = {4, 5, 6, 8, 5, 6, 4, 6, 8, 2, 0, -10, -80, 62, -1};
        Assert.assertEquals(-80, a.MinArray(k));
    }
    @Test
    public void lap4minArraytest1() {
        int b[] = {4, -8, -9, -5, 8, -1, -200, 5, 0, -10, -80, 62, -1};
        Assert.assertEquals(-200,a.MinArray(b));
    }
    @Test
    public void lap4minArraytest2() {
        int b[] = {4, -8, -9, -5, 8, -5541, -10, -80, 62, -1};
        Assert.assertEquals(-5541,a.MinArray(b));
    }
    @Test
    public void lap4minArraytest3() {
        int b[] = {4,9,6,89,6889,7,0};
        Assert.assertEquals(0,a.MinArray(b));
    }
    @Test
    public void lap4minArraytest4() {
        int b[] = {4,8,6,6,9,5,8,6};
        Assert.assertEquals(4,a.MinArray(b));
    }
    @Test
    public void lap4minArraytest5() {
        int b[] = {5,8,0,5,6,9,4,-5,5,8,6,2,0,-53};
        Assert.assertEquals(-53,a.MinArray(b));
    }


}