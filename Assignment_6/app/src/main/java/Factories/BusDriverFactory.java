package Factories;
import Domain.BusDriver;

/**
 * Created by mgijma on 2016/04/03.
 */
public class BusDriverFactory {

        public static BusDriver getBusDriver(String st_num, String name, String surname) {
            BusDriver myClass = new BusDriver.Builder(st_num)
                    .name(name)
                    .surname(surname)
                    .build();

            return myClass;
        }
    }
