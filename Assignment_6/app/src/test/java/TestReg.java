import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.BusRegistration;
import Factories.BusRegFactory;

/**
 * Created by mgijma on 2016/04/07.
 */
public class TestReg {

    private BusRegistration reg;


    @Before
    public void setUp() throws Exception {

        reg = BusRegFactory.getReg("CA12345","20-04-2016");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(reg.getBusRegNumber(),"CA12345");
        Assert.assertEquals(reg.getDate(), "20-04-2016");

    }

    @Test
    public void testNewUpdate() throws Exception {
        BusRegistration regUpdate = new BusRegistration.Builder(reg.getBusRegNumber())
                .Date("20-04-2016")
                .build();
        Assert.assertEquals(reg.getBusRegNumber(),"CA12345");
        Assert.assertEquals(reg.getDate(), "20-04-2016");
    }

}
