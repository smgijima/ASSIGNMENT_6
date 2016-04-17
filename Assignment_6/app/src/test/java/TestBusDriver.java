
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.BusDriver;
import Factories.BusDriverFactory;

/**
 * Created by mgijma on 2016/04/03.
 */
public class TestBusDriver {

    private BusDriver driver;


    @Before
    public void setUp() throws Exception {

        driver = BusDriverFactory.getBusDriver("91292","Mzuvukile", "Lawana");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(driver.getStuff_Num(),"91292");
        Assert.assertEquals(driver.getName(), "Mzuvukile");
        Assert.assertEquals(driver.getSurname(), "Lawana");

    }

    @Test
    public void testNewUpdate() throws Exception {
        BusDriver busUpdate = new BusDriver.Builder(driver.getStuff_Num())
                .copy(driver)
                .name("Mzuvukile")
                .surname("Lawana")
                .build();
        Assert.assertEquals(busUpdate.getStuff_Num(),"91292");
        Assert.assertEquals(busUpdate.getName(), "Mzuvukile");
        Assert.assertEquals(busUpdate.getSurname(), "Lawana");

    }
}
