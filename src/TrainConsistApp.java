import java.util.Arrays;

public class TrainConsistApp {

    // Method for search with validation
    public static boolean searchBogie(String[] bogies, String key) {

        // ✅ Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // ✅ Linear Search (you can reuse UC18 logic)
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Example 1: Normal case
        String[] bogies = {"BG101", "BG205", "BG309"};

        try {
            boolean found = searchBogie(bogies, "BG205");
            System.out.println("Search Result: " + found);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 2: Empty case
        String[] emptyBogies = {};

        try {
            searchBogie(emptyBogies, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }
    }
}