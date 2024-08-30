public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop body for even values of i
            }
            System.out.println("Odd value of i: " + i);
        }
    }
}
