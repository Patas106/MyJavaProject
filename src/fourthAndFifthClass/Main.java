package fourthAndFifthClass;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws CartException {

        try {
            Item item1 = new Item("hojer", BigDecimal.valueOf(100), LocalDateTime.now(), 1, true, Category.food);
            System.out.println(item1.getDescription());
        } catch (CartException e) {
            System.out.println("Chyba: " + e.getMessage());
        }

        try {
            Item item2 = new Item("Test item", BigDecimal.valueOf(-100), LocalDateTime.now(), 1, true, Category.consumables);
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

        //řazení jmen podle abecedy na zkoušku
        List<String> texts = new ArrayList<>();
        texts.addAll(List.of("John", "Mary", "Tom", "Anna", "Bob"));
        texts.sort(String::compareTo); //pořadí podle abecedy
        System.out.println(texts);

        Cart cart = new Cart();
        try {
            cart.addItems(List.of(
                    new Item("Koleno", BigDecimal.valueOf(100), LocalDateTime.now(), 1, true, Category.food),
                    new Item("Amama", BigDecimal.valueOf(200), LocalDateTime.now(), 1, true, Category.consumables),
                    new Item("Kolo", BigDecimal.valueOf(300), LocalDateTime.now(), 1, true, Category.others)
            ));


            System.out.println("Item added to cart: " + cart.getItems().get(0).getDescription());
        } catch (CartException e) {
            throw new RuntimeException(e);
        }
//        cart.sortByCategoryAndPrice();
//        System.out.println("Sorted items by category and price: " + cart.getItems()); // řazení podle kategorie a ceny
        cart.getItem(0).setDescription("Nový popis");
        cart.sortByCategory();
        System.out.println("Sorted items by category: " + cart.getItems()); // řazení podle kategorie
        cart.sort();
        System.out.println("Sorted items by price: " + cart.getItems()); // řazení podle ceny
        System.out.println("Sorted items by description: " + cart.getItems()); // řazení podle popisu

    }


}




