package Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by mgijima on 2016/04/07.
 */
@Entity
@Table(name = "BUS_DETAILS")
public class BusDetails {

    @Id
    @Column(name = "BUS_NO")
    private String BusNo;
    @Column(name = "BUS_TYPE")
    private String BusType;
    @Column(name = "NO_OF_SEATS")
    private String NoOfSeats;

    public String getBusNo() {
        return BusNo;
    }

    public String getBusType() {
        return BusType;
    }

    public String getNoOfSeats() {
        return NoOfSeats;
    }

    private BusDetails() {

    }

    private BusDetails(Builder builder) {
        this.BusNo = builder.BusNo;
        this.BusType = builder.BusType;
        this.NoOfSeats = builder.NoOfSeats;

    }

    public static class Builder{

        private String BusNo;
        private String BusType;
        private String NoOfSeats;


        public Builder (String busNo){
            this.BusNo = busNo;

        }
        public Builder Bustype(String busType){
            this.BusType = busType;
            return this;
        }

        public Builder Noofseats(String noOfSeats){
            this.NoOfSeats = noOfSeats;
            return this;
        }


        public Builder copy(BusDetails value) {
            this.BusNo = value.BusNo;
            this.BusType = value.BusType;
            this.NoOfSeats = value.NoOfSeats;
            return this;
        }

        public BusDetails build() {
            return new BusDetails(this);
        }
    }
}
