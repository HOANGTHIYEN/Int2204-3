package test;

import com.Bmi;
import com.NumberOfBmi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfBmiTest {
    @Test
    public void testGetResult1() {
        assertEquals(Bmi.BINH_THUONG.toString(), NumberOfBmi.getResult(1.66, 52));
    }

    @Test
    public void testGetResult2() {
        assertEquals(Bmi.BINH_THUONG.toString(), NumberOfBmi.getResult(1.66, 52));
    }

    @Test
    public void testGetResult3() {
        assertEquals(Bmi.BEO_PHI.toString(), NumberOfBmi.getResult(1.66, 80));
    }

    @Test
    public void testGetResult4() {
        // 22.995
        assertEquals(Bmi.BINH_THUONG.toString(), NumberOfBmi.getResult(1.66, 63.365022));
    }

    @Test
    public void testGetResult5() {
        assertEquals(Bmi.BINH_THUONG.toString(), NumberOfBmi.getResult(1.62, 50));
    }
}
