package lap44;

        import  org.junit.Assert;
        import  org.junit.Test;

public class lap4Test {
    lap4 a=new lap4();
    @Test
    public void lap4test0(){
        Assert.assertEquals(45,a.max(45,20));
    }
    @Test
    public void lap4test1(){
        Assert.assertEquals(50,a.max(40,50));
    }
    @Test
    public void lap4test2(){
        Assert.assertEquals(85,a.max(85,-9));
    }
    @Test
    public void lap4test3(){
        Assert.assertEquals(10,a.max(100,100));
    }
    @Test
    public void lap4test4(){
        Assert.assertEquals(458,a.max(458,6));
    }
    @Test
    public void lap4test5(){
        Assert.assertEquals(565,a.max(565,8));
    }


}
