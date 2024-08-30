public class EnumMethodsExample {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        System.out.println("Today: " + today.name());          // Output: TODAY: FRIDAY
        System.out.println("Ordinal: " + today.ordinal());     // Output: Ordinal: 5

        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getType());
        }

        Day someDay = Day.valueOf("MONDAY");
        System.out.println("Some day: " + someDay);            // Output: Some day: MONDAY
    }
}
