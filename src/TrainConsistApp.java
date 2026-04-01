import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC10: Total Seat Calculation using reduce() ===");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury AC", 80));

        // Step 2: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // sum all

        // Step 3: Display result
        System.out.println("\nBogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}