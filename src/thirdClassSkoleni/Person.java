package thirdClassSkoleni;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Person {
    private int Id;
    private String name;
    private String surname;
    private BigDecimal accountBalance;
    private boolean isEmployee;
    private int ticketCount;
    private LocalDate lastArrivalDate;
    private double lastBodyTemperature;

    public Person(int id, String name, String surname, BigDecimal accountBalance, boolean isEmployee, int ticketCount, LocalDate lastArrivalDate, double lastBodyTemperature) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.accountBalance = accountBalance;
        this.isEmployee = isEmployee;
        this.ticketCount = ticketCount;
        this.lastArrivalDate = lastArrivalDate;
        this.lastBodyTemperature = lastBodyTemperature;
    }
    public Person(int id, String name, String surname) {
        this (id, name, surname, BigDecimal.valueOf(0), false, 0, LocalDate.now(), 36.5);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public LocalDate getLastArrivalDate() {
        return lastArrivalDate;
    }

    public void setLastArrivalDate(LocalDate lastArrivalDate) {
        this.lastArrivalDate = lastArrivalDate;
    }

    public double getLastBodyTemperature() {
        return lastBodyTemperature;
    }

    public void setLastBodyTemperature(double lastBodyTemperature) {
        this.lastBodyTemperature = lastBodyTemperature;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountBalance=" + accountBalance +
                ", isEmployee=" + isEmployee +
                ", ticketCount=" + ticketCount +
                ", lastArrivalDate=" + lastArrivalDate +
                ", lastBodyTemperature=" + lastBodyTemperature +
                '}';
    }
}
