//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int vymera = 250;
    String popis = "Sad je v parku";
    int cenaZaMetr = 100;

    Pozemek sadOsmicka = new Pozemek(150, "Koloho", 400);
    Pozemek sadOsmicka2 = new Pozemek(250, "Humanoid", 150);
        System.out.println(sadOsmicka2.getPopis());

    // Vypocet ceny
    int cena = vymera * cenaZaMetr;

        System.out.println("Pozemek ma rozlohu " + vymera + " m2" + " a cena je " + cena + " Kc");



    }
}