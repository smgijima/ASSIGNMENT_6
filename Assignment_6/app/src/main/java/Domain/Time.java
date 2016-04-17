package Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by mgijma on 2016/04/03.
 */
@Entity
@Table(name = "TIME")
public class Time {

    @Id
    @Column(name = "HOUR")
    private String hour;
    @Column(name = "MINUTE")
    private String minute;



    public String getHour() {
        return hour;
    }

    public String getMinute(){
        return minute;
    }

    private Time() {

    }

    private Time(Builder builder) {
        this.hour = builder.hour;
        this.minute = builder.minute;

    }

    public static class Builder{
        private String hour;
        private String minute;



        public Builder (String hour){
            this.hour = hour;

        }
        public Builder minutes(String minute){
            this.minute = minute;
            return this;
        }


        public Builder copy(Time value) {
            this.hour = value.hour;
            this.minute = value.minute;
            return this;
        }

        public Time build() {
            return new Time(this);
        }
    }
}
