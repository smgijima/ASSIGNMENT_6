import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.BusStation;
import Factories.BusStationFactory;

/**
 * Created by mgijma on 2016/04/07.
 */
public class TestBusStation {

    private BusStation station;


    @Before
    public void setUp() throws Exception {

        station = BusStationFactory.getStation("001","CPUT","Cape Town","8001");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(station.getBusStationCode(),"001");
        Assert.assertEquals(station.getName(), "CPUT");
        Assert.assertEquals(station.getCity(),"Cape Town");
        Assert.assertEquals(station.getCode(),"8001");
    }

    @Test
    public void testNewUpdate() throws Exception {
        BusStation stationUpdate = new BusStation.Builder(station.getBusStationCode())
                .copy(station)
                .Name("CPUT")
                .City("Cape Town")
                .Code("8001")
                .build();

        Assert.assertEquals(station.getBusStationCode(),"001");
        Assert.assertEquals(station.getName(), "CPUT");
        Assert.assertEquals(station.getCity(),"Cape Town");
        Assert.assertEquals(station.getCode(),"8001");
    }


}
