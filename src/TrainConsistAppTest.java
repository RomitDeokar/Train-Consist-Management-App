import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistAppTest {

    // Helper method to create test data
    private List<Bogie> createBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury AC", 80));
        return bogies;
    }

    // ✅ Test 1: Loop filtering logic
    @Test
    void testLoopFilteringLogic() {
        List<Bogie> bogies = createBogies();

        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertEquals(2, result.size()); // Sleeper + Luxury AC
    }

    // ✅ Test 2: Stream filtering logic
    @Test
    void testStreamFilteringLogic() {
        List<Bogie> bogies = createBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    // ✅ Test 3: Loop vs Stream results match
    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> bogies = createBogies();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    // ✅ Test 4: Execution time is valid
    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> bogies = createBogies();

        long start = System.nanoTime();

        bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long end = System.nanoTime();

        long time = end - start;

        assertTrue(time > 0); // time must be positive
    }

    // ✅ Test 5: Large dataset processing
    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
        }

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertTrue(result.size() > 0);
    }
}