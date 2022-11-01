package mymavenpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testprg {

    @Test
    public void testlogin1()
    {
        MyJavaPrg obj1 = new MyJavaPrg();
        Assert.assertEquals(0, obj1.userlogin("abc","ab123"));
    }

    @Test
    public void testlogin2()
    {
        MyJavaPrg obj1 = new MyJavaPrg();
        Assert.assertEquals(1, obj1.userlogin("abc","abc@123"));
    }
}

