package fourthAndFifthClass;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Item implements Comparable<Item> {
    private String description;
    private BigDecimal price;
    private LocalDateTime reservationDate;
    private boolean isOnStock;
    private int quantity;
    private Category category;

    public Item(String description, BigDecimal price, LocalDateTime reservationDate, int quantity, boolean isOnStock, Category category) throws CartException {
        this.description = description;
        setPrice(price);
        this.reservationDate = reservationDate;
        this.quantity = quantity;
        this.isOnStock = isOnStock;
        this.category = category;
    }

    public Item(String description, BigDecimal price, Category category) throws CartException {
        this(description, price, LocalDateTime.now(), 1, true, category);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws CartException {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new CartException("Cena položky nemůže být záporná: " + price + " Kč");
        }
        this.price = price;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public boolean isOnStock() {
        return isOnStock;
    }

    public void setOnStock(boolean onStock) {
        isOnStock = onStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", reservationDate=" + reservationDate +
                ", isOnStock=" + isOnStock +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }

    @Override
    public int compareTo(Item other) {
        return this.price.compareTo(other.price); // porovnání podle ceny vzestupně
    }
}
