import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.Time;
import Factories.TimeFactory;


/**
 * Created by mgijima on 2016/04/03.
 */
public class TestTime {

    private Time tm;


    @Before
    public void setUp() throws Exception {

        tm = TimeFactory.getArea("20","11");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(tm.getHour(),"20");
        Assert.assertEquals(tm.getMinute(), "11");


    }

    @Test
    public void testNewUpdate() throws Exception {
        Time busUpdate = new Time.Builder(tm.getHour())
                .copy(tm)
                .minutes("10")
                .build();
        Assert.assertEquals(busUpdate.getHour(),"20");
        Assert.assertEquals(busUpdate.getMinute(), "10");

    }
}
