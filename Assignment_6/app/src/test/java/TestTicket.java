import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Domain.Ticket;
import Factories.TicketFactory;

/**
 * Created by mgijma on 2016/04/07.
 */
public class TestTicket {

    private Ticket ticket;


    @Before
    public void setUp() throws Exception {

        ticket = TicketFactory.getTicket("0001","11-12-2016","156","4","free","reserve");
    }

    @Test
    public void testClass() throws Exception {

        Assert.assertEquals(ticket.getTicketId(),"0001");
        Assert.assertEquals(ticket.getDate(), "11-12-2016");
        Assert.assertEquals(ticket.getBusNo(),"156");
        Assert.assertEquals(ticket.getSeatNo(),"4");
        Assert.assertEquals(ticket.getStatus(),"free");
        Assert.assertEquals(ticket.getCheckingStatus(),"reserve");
    }

    @Test
    public void testNewUpdate() throws Exception {
        Ticket ticketUpdate = new Ticket.Builder(ticket.getTicketId())
                .copy(ticket)
                .Date("11-12-2016")
                .BusNo("156")
                .SeatNo("4")
                .Status("free")
                .CheckingStatus("reserve")
                .build();

        Assert.assertEquals(ticket.getTicketId(),"0001");
        Assert.assertEquals(ticket.getDate(), "11-12-2016");
        Assert.assertEquals(ticket.getBusNo(),"156");
        Assert.assertEquals(ticket.getSeatNo(),"4");
        Assert.assertEquals(ticket.getStatus(),"free");
        Assert.assertEquals(ticket.getCheckingStatus(),"reserve");
    }

}
