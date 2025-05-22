package fourthClass;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) throws CartException {

     try {
         Item item1 = new Item("Test item", BigDecimal.valueOf(100), LocalDateTime.now(), 1, true, Category.food);
         System.out.println(item1.getDescription());
     } catch (CartException e) {
         System.out.println("Chyba: " + e.getMessage());}

        try {   Item item2 = new Item("Test item", BigDecimal.valueOf(-100), LocalDateTime.now(), 1, true, Category.consumables);
         System.out.println(item2.getDescription());
        } catch (CartException e) {
            System.out.println("Chyba: " + e.getMessage());
        }

        try {
         Item item3 = new Item("Ses Kar", BigDecimal.valueOf(100), LocalDateTime.now(), 1, true, Category.others);
         System.out.println("Blabla: " + item3.getDescription() + " " + item3.getCategory());
        } catch (CartException e) {
         System.out.println("Chyba: " + e.getMessage());
        }

    }

}

