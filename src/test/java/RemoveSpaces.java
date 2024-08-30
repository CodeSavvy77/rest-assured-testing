public class RemoveSpaces {
    public static void main(String[] args) {
        String originalString = "This is a string with spaces.";
        String stringWithoutSpaces = originalString.replaceAll("\\s+", "");
        System.out.println("Original String: " + originalString);
        System.out.println("String without spaces: " + stringWithoutSpaces);

        String originalString1 = "This is a string with spaces.";
        String stringWithoutSpaces1 = originalString1.replace(" ", "");
        System.out.println("Original String: " + originalString1);
        System.out.println("String without spaces: " + stringWithoutSpaces1);

    }
}
