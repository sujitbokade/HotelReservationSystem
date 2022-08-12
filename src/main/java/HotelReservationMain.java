public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program !!!");
        HotelReservationService hotelReservationService=new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood",110));

    }
}
