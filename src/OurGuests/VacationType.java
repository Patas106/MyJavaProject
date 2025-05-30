package OurGuests;

public enum VacationType {
    BUSINNES("Pracovní"),
    RECREATION("Rekreační");


    private String description;

    VacationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
