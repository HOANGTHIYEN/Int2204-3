package test;

import com.PracticeB;
import org.junit.Test;

import static org.junit.Assert.*;

public class PracticeBTest {

    @Test
    public void testGetMinValue() {
        int[] arrayList = {1,2,3,4,5,6};
        assertEquals(1, PracticeB.getMinValue(arrayList));
    }

    @Test
    public void testGetMinValue2() {
        int[] arrayList = {5,8,1,3,7,6,1};
        assertEquals(1, PracticeB.getMinValue(arrayList));
    }

    @Test
    public void testGetMinValue3() {
        int[] arrayList = {5,4,6,8,1,6,8,1};
        assertEquals(1, PracticeB.getMinValue(arrayList));
    }

    @Test
    public void testGetMinValue4() {
        int[] arrayList = {48,61,2,3,15,62};
        assertEquals(2, PracticeB.getMinValue(arrayList));
    }

    @Test
    public void testGetMinValue5() {
        int[] arrayList = {12,3,4,15,6,78};
        assertEquals(3, PracticeB.getMinValue(arrayList));
    }
}
