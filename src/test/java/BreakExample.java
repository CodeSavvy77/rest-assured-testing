public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println("Value of i: " + i);
        }
        System.out.println("Loop terminated");
    }
}
