package fourthAndFifthClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) throws CartException {
        if (item == null) {
            throw new CartException("Položka nemůže být null");
        }
        items.add(item);
    }

    public void removeItem(Item item) throws CartException {
        if (item == null) {
            throw new CartException("Položka nemůže být null");
        }
        if (!items.remove(item)) {
            throw new CartException("Položka nebyla nalezena v košíku");
        }
    }

    public void addItems(List<Item> items) throws CartException {
       this.items.addAll(items);
}

    public List<Item> getItems() {
        return new ArrayList<>(items); //udělám kopii, aby se nemohlo manipulovat s originálem, mění se jen kopie
    }

    public void sort() {
        items.sort((item1, item2) -> item1.getPrice().compareTo(item2.getPrice()));
        items.sort(Comparator.comparing(Item::getDescription)); //Comparator.comparing je metoda, která porovnává dva objekty

    }

    public void sortByCategory() {
        items.sort(Comparator.comparing(Item::getCategory));
    }
    public void sortByCategoryAndPrice() {
        items.sort(Comparator.comparing(Item::getCategory).thenComparing(Item::getPrice));
    }


    public Item getItem (int index) {
        return  items.get (index);
}   //načítání ze souboru
    public void readFromTextFile(String filePath, String delimiter) throws CartException {
       int lineNumber = 0;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath))))  { //otevření souboru
            items.clear();
            while (scanner.hasNextLine()) {
                lineNumber++;
                String record = scanner.nextLine();
                String[] fields = record.split(delimiter); //rozdělení řádku podle oddělovače
               // items.add(new Item(fields));

                System.out.println("" + lineNumber+":" + record);


            }
        } catch (FileNotFoundException e) {
            throw new CartException("Soubor " +filePath+ "nebylo mžno otevřít: " + e.getLocalizedMessage());
        }
    }


}



