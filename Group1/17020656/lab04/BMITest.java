/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BMITest {
    @Test
    public void testGetBMI() {
        assertEquals("Binh thuong",BMI.GetBMI(61, 1.78));
        assertEquals("Thieu can",BMI.GetBMI(56, 1.8));
        assertEquals("Thua can",BMI.GetBMI(80, 1.8));
        assertEquals("Beo phi",BMI.GetBMI(90, 1.6));
        assertEquals("Binh thuong",BMI.GetBMI(70, 1.78));
    }
}
