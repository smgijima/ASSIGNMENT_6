

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.BusClass;
import Factories.BusFactory;


/**
 * Created by mgijma on 2016/04/03.
 */
public class BusTest {
        private BusClass bus;


        @Before
        public void setUp() throws Exception {

            bus = BusFactory.getBussclass("2","First Class", "return");
        }

        @Test
        public void testClass() throws Exception {
            Assert.assertEquals(bus.getTickets(),"2");
            Assert.assertEquals(bus.getType(), "First Class");
            Assert.assertEquals(bus.getOne_or_return(), "return");

        }

        @Test
        public void testNewUpdate() throws Exception {
            BusClass busUpdate = new BusClass.Builder(bus.getTickets())
                    .copy(bus)
                    .type("First Class")
                    .oneWayOrReturn("one way")
                    .build();
            Assert.assertEquals(busUpdate.getTickets(),"2");
            Assert.assertEquals(busUpdate.getType(), "First Class");
            Assert.assertEquals(busUpdate.getOne_or_return(), "one way");

        }
    }



