import java.util.*;

/**
 * Train Consist Management App - UC1
 * Initializes train and displays initial consist summary
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}