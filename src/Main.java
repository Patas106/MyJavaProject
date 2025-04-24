import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
Seller seller1 = new Seller("John Doe", LocalDate.of(1985, 5, 15), 100, 50.0, true);
Seller seller2 = new Seller("Jane Smith", LocalDate.of(1990, 8, 20), 200, 75.6, false);

printSellerInfo("first", seller1, "He");
printSellerInfo("second", seller2, "She");
}

public static void printSellerInfo(String order, Seller seller, String pronoun) {
System.out.println("The " + order + " seller's name is " + seller.getName()
+ ". " + pronoun + " was born on " + seller.getDateOfBirth()
+ ", completed " + seller.getNumberOfTransactions() + " transactions"
+ ", sold " + seller.getTonsOfCarrotsSold() + " tons of carrots"
+ ", and is " + (seller.isSeniorSeller() ? "a senior seller." : "not a senior seller."));
}
}
