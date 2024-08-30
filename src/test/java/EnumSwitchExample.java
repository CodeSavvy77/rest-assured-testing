public class EnumSwitchExample {
    public static void main(String[] args) {
        Day day = Day.SATURDAY;

        switch (day) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a weekday.");
        }
    }
}
