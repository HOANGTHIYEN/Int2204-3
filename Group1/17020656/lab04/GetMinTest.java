/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class GetMinTest {
    @Test
    public void testMin1() {
        assertEquals(2,GetMin.Min(new int[]{2,3,4,5}));
    }
    public void testMin2() {
        assertEquals(-3,GetMin.Min(new int[]{4,5,-3,1,9,0}));
     }
     public void testMin3() {
        assertEquals(-10,GetMin.Min(new int[]{-10,9,-3,1,7,6,10}));
     }
     public void testMin4() {
        assertEquals(5,GetMin.Min(new int[]{6,5,20,100,9,17}));
     }
     public void testMin5() {
        assertEquals(3,GetMin.Min(new int[]{4,5,3,7,9}));
    }
}
