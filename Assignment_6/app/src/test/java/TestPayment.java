import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.Payment;
import Factories.PaymentFactory;

/**
 * Created by mgijma on 2016/04/06.
 */
public class TestPayment {
    private Payment pay;


    @Before
    public void setUp() throws Exception {

        pay = PaymentFactory.getPayment("100","200","100");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(pay.getAmount(),"100");
        Assert.assertEquals(pay.getFromAccount(), "200");
        Assert.assertEquals(pay.getToAccount(),"100");
    }

    @Test
    public void testNewUpdate() throws Exception {
        Payment payUpdate = new Payment.Builder(pay.getAmount())
                .copy(pay)
                .FromAccount("100")
                .ToAccount("200")
                .build();
        Assert.assertEquals(pay.getAmount(), "100");
        Assert.assertEquals(pay.getFromAccount(), "200");
        Assert.assertEquals(pay.getToAccount(), "100");
    }
}
