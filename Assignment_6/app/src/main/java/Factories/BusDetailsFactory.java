package Factories;


import Domain.BusDetails;

/**
 * Created by mgijima on 2016/04/07.
 */
public class BusDetailsFactory {

    public static BusDetails getDetails(String BusNo, String BusType, String NoOfSeats) {
        BusDetails details = new BusDetails.Builder(BusNo)
                .Bustype(BusType)
                .Noofseats(NoOfSeats)
                .build();

        return details;
    }
}
