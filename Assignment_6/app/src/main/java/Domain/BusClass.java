package Domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Created by mgijima on 2016/04/03.
 */
@Entity
@Table(name = "BUSCLASS")
public class BusClass {

    @Id
    @Column (name= "TICKET")
    private String tickets;
    @Column(name="TYPE")
    private String type;
    @Column(name="ONE_OR_RETURN")
    private String one_or_return;

    public String getTickets() {
        return tickets;
    }

    public String getType() {
        return type;
    }

    public String getOne_or_return() {
        return one_or_return;
    }
    private BusClass() {

    }

    private BusClass(Builder builder) {
        this.tickets = builder.tickets;
        this.type = builder.type;
        this.one_or_return= builder.one_or_return;
    }

    public static class Builder{
        private String tickets;
        private String type;
        private String one_or_return;

        public Builder (String ticket){
            this.tickets = ticket;

        }
        public Builder type(String type){
            this.type = type;
            return this;

        }
        public Builder oneWayOrReturn(String one_or_return){
            this.one_or_return = one_or_return;

            return this;
        }

        public Builder copy(BusClass value) {
            this.tickets = value.tickets;
            this.type = value.type;
            this.one_or_return = value.one_or_return;
            return this;
        }

        public BusClass build() {
            return new BusClass(this);
        }
    }
}
