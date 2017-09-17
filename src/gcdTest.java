import org.junit.Assert;

import static org.junit.Assert.*;

public class gcdTest {
    gcd test = new gcd();
    @org.junit.Test
    public void GCDofArray() throws Exception {
        int arrOfnum []= {12,26, 34, 72,144};
        Assert.assertEquals(2,test.GCDofArray(arrOfnum));

    }

}