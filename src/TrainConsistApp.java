import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison (Loop vs Stream) ===");

        List<Bogie> bogies = new ArrayList<>();

        // Create large dataset for better comparison
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
            bogies.add(new Bogie("First Class", 24));
            bogies.add(new Bogie("Luxury AC", 80));
        }

        // ---------------- LOOP METHOD ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM METHOD ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- OUTPUT ----------------
        System.out.println("\nLoop Filtered Count: " + loopFiltered.size());
        System.out.println("Stream Filtered Count: " + streamFiltered.size());

        System.out.println("\nLoop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");

        // Optional: check correctness
        System.out.println("\nResults match: " + (loopFiltered.size() == streamFiltered.size()));
    }
}