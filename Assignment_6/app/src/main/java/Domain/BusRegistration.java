package Domain;;import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by mgijma on 2016/04/07.
 */
@Entity
@Table(name = "BUS_REGISTRATION")
public class BusRegistration {

    @Id
    @Column(name = "REG_NUMBER")
    private String busRegNumber;
    @Column(name = "DATE")
    private String date;

    public String getBusRegNumber() {
        return busRegNumber;
    }

    public String getDate() {
        return date;
    }


    private BusRegistration() {

    }

    private BusRegistration(Builder builder) {
        this.busRegNumber = builder.busRegNumber;
        this.date = builder.date;
    }

    public static class Builder{

        private String busRegNumber;
        private String date;

        public Builder (String busRegNumber){
            this.busRegNumber = busRegNumber;

        }
        public Builder Date(String date){
            this.date = date;
            return this;
        }

        public Builder copy(BusRegistration value) {
            this.busRegNumber = value.busRegNumber;
            this.date = value.date;
            return this;
        }

        public BusRegistration build() {
            return new BusRegistration(this);
        }
    }
}
