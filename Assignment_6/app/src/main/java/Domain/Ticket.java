package Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by mgijma on 2016/04/07.
 */
@Entity
@Table(name = "TICKET")
public class Ticket {

    @Id
    @Column(name = "TICKET_ID")
    private String TicketId;
    @Column(name = "DATE")
    private String Date;
    @Column(name = "BUS_NO")
    private String BusNo;
    @Column(name = "SEAT_NO")
    private String SeatNo;
    @Column(name = "STATUS")
    private String Status;
    @Column(name = "CHECK_STATUS")
    private String CheckingStatus;




    public String getDate() {
        return Date;
    }

    public String getTicketId() {
        return TicketId;
    }

    public String getBusNo() {
        return BusNo;
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public String getStatus() {
        return Status;
    }

    public String getCheckingStatus() {
        return CheckingStatus;
    }

    private Ticket() {

    }

    private Ticket(Builder builder) {
        this.TicketId = builder.TicketId;
        this.Date = builder.Date;
        this.BusNo = builder.BusNo;
        this.SeatNo = builder.SeatNo;
        this.Status = builder.Status;
        this.CheckingStatus = builder.CheckingStatus;

    }

    public static class Builder{

        private String TicketId;
        private String Date;
        private String BusNo;
        private String SeatNo;
        private String Status;
        private String CheckingStatus;


        public Builder (String ticketId){
            this.TicketId = ticketId;

        }
        public Builder Date(String date){
            this.Date = date;
            return this;
        }

        public Builder BusNo(String busNo){
            this.BusNo = busNo;
            return this;
        }

        public Builder SeatNo(String seatNo){
            this.SeatNo = seatNo;
            return this;
        }

        public Builder Status(String status){
            this.Status = status;
            return this;
        }

        public Builder CheckingStatus(String checkingStatus){
            this.CheckingStatus = checkingStatus;
            return this;
        }

        public Builder copy(Ticket value) {
            this.TicketId = value.TicketId;
            this.Date = value.Date;
            this.BusNo = value.BusNo;
            this.SeatNo = value.SeatNo;
            this.Status = value.Status;
            this.CheckingStatus = value.CheckingStatus;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
