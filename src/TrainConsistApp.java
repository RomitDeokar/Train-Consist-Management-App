import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names using Arrays.sort() ===");

        // Step 1: Create array of bogie names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogies));

        // Step 2: Built-in sorting
        Arrays.sort(bogies);

        // Step 3: Display result
        System.out.println("After Sorting: " + Arrays.toString(bogies));
    }
}