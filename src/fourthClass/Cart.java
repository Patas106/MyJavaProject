package fourthClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
}
}



