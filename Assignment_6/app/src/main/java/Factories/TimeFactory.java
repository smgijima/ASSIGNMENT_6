package Factories;
import Domain.Time;

/**
 * Created by mgijma on 2016/04/03.
 */
public class TimeFactory {

    public static Time getArea(String hour, String minutes) {
        Time myClass = new Time.Builder(hour)
                .minutes(minutes)
                .build();

        return myClass;
    }
}
