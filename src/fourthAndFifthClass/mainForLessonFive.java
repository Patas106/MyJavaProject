package fourthAndFifthClass;

public class mainForLessonFive {
    private static final String FILE_PATH = "resources/cart.txt";
    private static final String DELIMITER = ";";

    public static void main(String[] args) throws CartException {
        Cart cart = new Cart();
        try {
            cart.readFromTextFile(FILE_PATH, DELIMITER);
        } catch (CartException e) {
            System.err.println("Chyba při čtení z textového souboru: " + e.getMessage());
        }
    }
}
