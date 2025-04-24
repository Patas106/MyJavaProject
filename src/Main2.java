import java.math.BigDecimal;

public class Main2 {
public static void main(String[] args) {
Computer computer = new Computer( "ABC123", 15.6, true, new BigDecimal(1200), true);
Computer computer2 = new Computer( "XYZ789", 17.3, false, new BigDecimal(800), false);
Computer computer3 = new Computer( new BigDecimal(1500)); //použití druhého konstruktoru
Computer computer4 = new Computer(true, new BigDecimal(2000)); //použití čtvrtého konstruktoru



    computer.setModel("ABC123");
System.out.println("Model: " + computer.getModel());
System.out.println(computer.isOverPriceLimit(new BigDecimal(1000)));
System.out.println(computer4.getModel());
}
};