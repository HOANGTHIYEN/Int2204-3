package lap44;

import org.junit.Assert;
import org.junit.Test;

public class testBMI {

    lap4 c=new lap4();
    @Test
    public void testBMI0(){
        Assert.assertEquals("Thiếu cân",c.BMI(45,1.62));
    }
    @Test
    public void testBMI1(){
        Assert.assertEquals("Bình thường",c.BMI(60,1.62));
    }
    @Test
    public void testBMI2(){
        Assert.assertEquals("Thừa cân",c.BMI(65,1.64));
    }
    @Test
    public void testBMI3(){
        Assert.assertEquals("Béo phì",c.BMI(80,1.6));
    }
    @Test
    public void testBMI4(){
        Assert.assertEquals("Bình thường",c.BMI(50,1.6));
    }
    @Test
    public void testBMI5(){
        Assert.assertEquals("Thừa cân",c.BMI(60,1.58));
    }
}
