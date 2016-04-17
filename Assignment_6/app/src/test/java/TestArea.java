import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.Area;
import Factories.AreaFactory;

/**
 * Created by mgijima on 2016/04/03.
 */
public class TestArea {

    private Area area;


    @Before
    public void setUp() throws Exception {

        area = AreaFactory.getArea("Cape Town","27 Plain Street");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(area.getName(),"Cape Town");
        Assert.assertEquals(area.getAdress(), "27 Plain Street");
    }

    @Test
    public void testNewUpdate() throws Exception {
        Area AreaUpdate = new Area.Builder(area.getName())
                .copy(area)
                .adress("Mzuvukile")
                .build();
        Assert.assertEquals(area.getName(),"Cape Town");
        Assert.assertEquals(area.getAdress(), "27 Plain Street");


    }
}
