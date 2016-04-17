import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.Passenger;
import Factories.PassengerFactory;

/**
 * Created by mgijma on 2016/04/03.
 */
public class PassengerTest {
    private Passenger person;


    @Before
    public void setUp() throws Exception {

        person = PassengerFactory.getPassenger("Siphiwo","Mgijima", "24");
    }

    @Test
    public void testPassenger() throws Exception {
        Assert.assertEquals(person.getName(),"Siphiwo");
        Assert.assertEquals(person.getSurname(), "Mgijima");
        Assert.assertEquals(person.getAge(), "24");

    }

    @Test
    public void testNewUpdate() throws Exception {
        Passenger passengerUpdate = new Passenger.Builder(person.getName())
                .copy(person)
                .age("24")
                .surname("Mgijima")
                .build();
        Assert.assertEquals(passengerUpdate.getName(),"Siphiwo");
        Assert.assertEquals(passengerUpdate.getSurname(), "Mgijima");
        Assert.assertEquals(passengerUpdate.getAge(), "24");

    }
}
