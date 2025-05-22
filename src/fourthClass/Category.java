package fourthClass;

public enum Category {
    food("Jídlo"),
    consumables("domácnost"),
    others("Ostatní");

   final private String name;

    Category(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
@Override
public String toString() {
        return name;
    }}
