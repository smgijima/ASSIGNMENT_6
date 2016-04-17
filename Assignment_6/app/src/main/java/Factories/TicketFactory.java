package Factories;
import Domain.Ticket;

/**
 * Created by mgijma on 2016/04/07.
 */
public class TicketFactory {

    public static Ticket getTicket(String Ticketid, String Date, String Busno, String Seatno, String Status, String Checkingstatus) {
        Ticket myTicket = new Ticket.Builder(Ticketid)
                .Date(Date)
                .BusNo(Busno)
                .SeatNo(Seatno)
                .Status(Status)
                .CheckingStatus(Checkingstatus)
                .build();

        return myTicket;
    }
}
