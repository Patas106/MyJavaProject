package OurGuests;

import java.math.BigDecimal;

public class Room {
    private int numberOfBeds;
    private int roomNumber;
    private boolean isThereABalcony;
    private boolean isThereAViewOnTheSea;
    private BigDecimal roomPrice;


    public Room(int numberOfBeds, int roomNumber, boolean isThereABalcony, boolean isThereAViewOnTheSea, BigDecimal roomPrice) {
        this.numberOfBeds = numberOfBeds;
        this.roomNumber = roomNumber;
        this.isThereABalcony = isThereABalcony;
        this.isThereAViewOnTheSea = isThereAViewOnTheSea;
        this.roomPrice = roomPrice;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isThereABalcony() {
        return isThereABalcony;
    }

    public void setThereABalcony(boolean thereABalcony) {
        isThereABalcony = thereABalcony;
    }

    public boolean isThereAViewOnTheSea() {
        return isThereAViewOnTheSea;
    }

    public void setThereAViewOnTheSea(boolean thereAViewOnTheSea) {
        isThereAViewOnTheSea = thereAViewOnTheSea;
    }
    public BigDecimal getRoomPrice() {
        return roomPrice;
    }
    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }
    @Override
    public String toString() {
        return "Číslo pokoje: " + roomNumber + ", Počet postelí: " + numberOfBeds + ", Balkon: " + isThereABalcony + ", Výhled na moře: " + isThereAViewOnTheSea + ", Cena pokoje: " + roomPrice;
    }

    public BigDecimal getPricePerNight() {
        return roomPrice;
    }
    public void setPricePerNight(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }
}
