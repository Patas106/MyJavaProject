package OurGuests;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class Main {
    static List<Booking> bookings = new ArrayList<>();
    static DateTimeFormatter dateFormatter =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
       public static void main(String[] args) {
        // Create a new guest
        Guest guest = new Guest("John", "Doe", LocalDate.of(1990, 1, 1));

        // Create a new room
        Room room = new Room(2, 101, true, false, BigDecimal.valueOf(100.00));

        // Create a new booking
        Booking booking = new Booking(room, VacationType.RECREATION, guest);

        // Print the booking details
        System.out.println("Booking Details:");
        System.out.println("Guest: " + guest);
        System.out.println("Room: " + room);
        System.out.println("Check-in Date: " + booking.getCheckInDate().format(Main.dateFormatter));
        System.out.println("Check-out Date: " + booking.getCheckOutDate().format(Main.dateFormatter));
    }
}
