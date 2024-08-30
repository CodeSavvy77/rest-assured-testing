public enum Day {
    SUNDAY("Weekend"),
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend");

    private final String type;

    // Constructor
    Day(String type) {
        this.type = type;
    }

    // Method
    public String getType() {
        return type;
    }
}

