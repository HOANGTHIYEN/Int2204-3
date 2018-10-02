/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare;

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
public class CompareTest {
    @Test
    public void testMax() 
    {
       assertEquals(20, Compare.max(10,20) );
       assertEquals(50, Compare.max(10,50) );
       assertEquals(-30,Compare.max(-70,-30));
       assertEquals(0, Compare.max(-20, 0));
       assertEquals(10, Compare.max(-15, 10));
    }
}
