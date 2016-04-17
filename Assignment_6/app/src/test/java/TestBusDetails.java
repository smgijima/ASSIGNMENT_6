
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.BusDetails;
import Factories.BusDetailsFactory;


/**
 * Created by mgijima on 2016/04/07.
 */
public class TestBusDetails {

    private BusDetails details;


    @Before
    public void setUp() throws Exception {

        details = BusDetailsFactory.getDetails("0002","SleepLiner", "30");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(details.getBusNo(),"0002");
        Assert.assertEquals(details.getBusType(), "SleepLiner");
        Assert.assertEquals(details.getNoOfSeats(), "30");

    }

    @Test
    public void testNewUpdate() throws Exception {
        BusDetails detailsUpdate = new BusDetails.Builder(details.getBusNo())
                .Bustype("coach class")
                .Noofseats("30")
                .build();
        Assert.assertEquals(details.getBusNo(),"0002");
        Assert.assertEquals(details.getBusType(), "SleepLiner");
        Assert.assertEquals(details.getNoOfSeats(), "30");
    }
}
