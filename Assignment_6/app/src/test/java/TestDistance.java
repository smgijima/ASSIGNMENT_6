import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.CalculateDistance;

/**
 * Created by mgijma on 2016/04/07.
 */
public class TestDistance {

    CalculateDistance one;
    CalculateDistance two;
    @Before
    public void setUp() throws Exception {
        one = new CalculateDistance("300", "200") {
        };
        two = (CalculateDistance) one.calculate();
    }

    @Test
    public void testClone() throws Exception {
        Assert.assertEquals(one.toString(),two.toString());
    }

}
