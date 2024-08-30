public class EnumWithFieldsExample {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getType());
        }
    }
}
