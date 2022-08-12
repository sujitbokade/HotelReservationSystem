import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    static HotelReservationService hotelReservation;

    @BeforeAll
    static void initialize() {
        hotelReservation = new HotelReservationService();
    }

    @Test
    void givenHotel_ShouldBe_AddedToHotelList() {
        boolean result=hotelReservation.addHotel(new Hotel("Lakewood",110));
        Assertions.assertTrue(result);
    }
}