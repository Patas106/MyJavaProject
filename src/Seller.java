import java.time.LocalDate;

public class Seller {
    private String name;
    private LocalDate dateOfBirth;
    private int numberOfTransactions;
    private double tonsOfCarrotsSold;
    private boolean isSeniorSeller;

    public Seller(String name, LocalDate dateOfBirth, int numberOfTransactions, double tonsOfCarrotsSold, boolean isSeniorSeller) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.numberOfTransactions = numberOfTransactions;
        this.tonsOfCarrotsSold = tonsOfCarrotsSold;
        this.isSeniorSeller = isSeniorSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public double getTonsOfCarrotsSold() {
        return tonsOfCarrotsSold;
    }

    public void setTonsOfCarrotsSold(double tonsOfCarrotsSold) {
        this.tonsOfCarrotsSold = tonsOfCarrotsSold;
    }

    public boolean isSeniorSeller() {
        return isSeniorSeller;
    }

    public void setSeniorSeller(boolean seniorSeller) {
        isSeniorSeller = seniorSeller;
    }
}
