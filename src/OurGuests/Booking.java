package OurGuests;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

public class Booking {
    private List<Guest> guests = new ArrayList<>();
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Room room;
    private VacationType vacationType;


    public Booking(List<Guest> guests, LocalDate checkInDate, LocalDate checkOutDate, Room room, VacationType vacationType) {
        this.guests.addAll(guests);
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
        this.vacationType = vacationType;
    }

    public Booking (LocalDate checkInDate, LocalDate checkOutDate, Room room, VacationType vacationType) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
        this.vacationType = vacationType;
    }
    public Booking (Room room, VacationType vacationType, Guest guest) {
        this(LocalDate.now(), LocalDate.now().plusDays(5), room, vacationType);
        this.guests.add(guest);
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public VacationType getVacationType() {
        return vacationType;
    }

    public void setVacationType(VacationType vacationType) {
        this.vacationType = vacationType;
    }
   /*public BigDecimal getTotalPriceForAllGuests() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Guest guest : guests) {
            totalPrice = totalPrice.add(getTotalPrice());
        }
        return totalPrice;
    }*/
    public BigDecimal totalDaysForStay() {
        return BigDecimal.valueOf(DAYS.between(checkInDate, checkOutDate));
    }


    public BigDecimal getTotalPrice() {
        long days = checkInDate.until(checkOutDate).getDays();
        return room.getPricePerNight().multiply(BigDecimal.valueOf(days));
    }
    @Override
    public String toString() {
       return "Rezervace: " + "\n" +
                "Datum příjezdu: " + checkInDate.format(Main.dateFormatter) + "\n" +
                "Datum odjezdu: " + checkOutDate.format(Main.dateFormatter) + "\n" +
                "Pokoj: " + room.toString() + "\n" +
                "Typ dovolené: " + vacationType.getDescription() + "\n" +
                "Hosté: " + guests.toString() + "\n" +
                "Celková cena za pobyt: " + getTotalPrice() + "\n";
    }
}
