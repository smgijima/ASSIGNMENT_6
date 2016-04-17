import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by mgijma on 2016/04/17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BusTest.class,
        PassengerTest.class,
        TestArea.class,
        TestBusDetails.class,
        TestBusDriver.class,
        TestBusStation.class,
        TestDistance.class,
        TestPayment.class,
        TestReg.class,
        TestTicket.class,
        TestTime.class,
        TestUser.class,

})
public class FactorySuits {
}

