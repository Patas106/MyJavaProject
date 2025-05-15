package thirdClassSkoleni;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
                                                                    // BIG DECIMAL: když dám new, tak bere desetinná čísla,
                                                                    //když dám bez new a valueOf, tak to nebere

        persons.add(new Person(1, "John", "Doe", new BigDecimal(1000.0), false, 5, LocalDate.now(), 36.5));
        persons.add(new Person(2, "Jane", "Smith", BigDecimal.valueOf(2000.54), true, 10, LocalDate.now(), 37.0));
        persons.add(new Person(3, "Alice", "Johnson"));

final int NUMBER_OF_PERSONS = 20;
        for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
        persons.add(new Person(4+i, "Huberto"+i + i, "guest" + i, BigDecimal.valueOf(300), false, 0, LocalDate.now(), -300.0));}



        persons.forEach(person -> {
            System.out.println("ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Account Balance: " + person.getAccountBalance());
            System.out.println("Is Employee: " + person.isEmployee());
            System.out.println("Ticket Count: " + person.getTicketCount());
            System.out.println("Last Arrival Date: " + person.getLastArrivalDate());
            System.out.println("Last Body Temperature: " + person.getLastBodyTemperature());
            System.out.println();
        });

       // persons.forEach(System.out::println); // dvě dvojtečky vypíšou pro všechny

        // dáse zapsat i jako takhle
       /* for (Person person : persons) {
            System.out.println("ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Account Balance: " + person.getAccountBalance());
            System.out.println("Is Employee: " + person.isEmployee());
            System.out.println("Ticket Count: " + person.getTicketCount());
            System.out.println("Last Arrival Date: " + person.getLastArrivalDate());
            System.out.println("Last Body Temperature: " + person.getLastBodyTemperature());
            System.out.println();
        }
    }*/

       /* System.out.println("Počet osob: " + persons.size());
        System.out.println("První osoba: " + persons.get(0).getName());
        persons.forEach(person -> {
            person.getName();
            System.out.println(person.getName());
        }); */


        persons.forEach(person -> {
           String output = person.getName() + " ";
            if (person.isEmployee()) {
                //System.out.println("Zaměstnanec: " + person.getName());

                //toje je stejné  jako out.println(person.getName() + " je zaměstnanec");
                output += "je zaměstnanec";

            } else {
               // System.out.println("Není zaměstnanec: " + person.getName());
                output += "není zaměstnanec";
            }
            System.out.println(output);
        });
        persons.forEach(person -> {
           if (!person.isEmployee()) {
                System.out.println("co ti je: " + person.getName());
            }
        });

        //napiš něco ternárním operátorem
        persons.forEach(person -> {
            String output = person.getName() + " " + (person.isEmployee() ? "je zaměstnanec" : "není zaměstnanec");
            System.out.println(output);
        });
        // spočítej celkový počet tiketů
        AtomicInteger totalTickets = new AtomicInteger();
        persons.forEach(person -> {
            totalTickets.addAndGet(person.getTicketCount());
            // chci jméno a počet tiketů
            System.out.println(person.getName() + " má " + person.getTicketCount() + " tiketů.");
        });

}}