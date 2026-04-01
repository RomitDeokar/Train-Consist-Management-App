import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieTest {

    // ✅ Test 1: Valid capacity
    @Test
    void testException_ValidCapacityCreation() {
        assertDoesNotThrow(() -> {
            Bogie b = new Bogie("Sleeper", 72);
            assertEquals(72, b.capacity);
        });
    }

    // ✅ Test 2: Negative capacity
    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception ex = assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Invalid", -10);
        });

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    // ✅ Test 3: Zero capacity
    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Invalid", 0);
        });
    }

    // ✅ Test 4: Exception message
    @Test
    void testException_ExceptionMessageValidation() {
        Exception ex = assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Invalid", -1);
        });

        assertTrue(ex.getMessage().contains("greater than zero"));
    }

    // ✅ Test 5: Object integrity
    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        Bogie b = new Bogie("AC Chair", 60);

        assertEquals("AC Chair", b.name);
        assertEquals(60, b.capacity);
    }

    // ✅ Test 6: Multiple valid bogies
    @Test
    void testException_MultipleValidBogiesCreation() {
        assertDoesNotThrow(() -> {
            new Bogie("Sleeper", 72);
            new Bogie("First Class", 24);
            new Bogie("Luxury AC", 80);
        });
    }
}