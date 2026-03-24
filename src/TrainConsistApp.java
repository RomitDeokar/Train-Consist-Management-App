import java.util.*;

/**
 * Train Consist Management App - UC5
 * Demonstrates LinkedHashSet for ordered + unique bogies
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("\nTrain Formation (Ordered & Unique):");
        System.out.println(trainFormation);
    }
}