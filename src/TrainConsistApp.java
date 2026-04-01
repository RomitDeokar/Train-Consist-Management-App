import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC14: Custom Exception Handling ===");

        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("Sleeper", 72));   // valid
            bogies.add(new Bogie("AC Chair", 60));  // valid

            // ❌ Invalid bogie
            bogies.add(new Bogie("Invalid Bogie", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nFinal Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}