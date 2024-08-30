public class NoOpExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Equivalent of 'pass' in Java: do nothing
            } else {
                System.out.println("Odd value of i: " + i);
            }
        }
    }
}
