import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoodsBogieTest {

    // ✅ Test 1: Safe assignment
    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie b = new GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.getCargo());
    }

    // ✅ Test 2: Unsafe assignment handled
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.getCargo()); // should not assign
    }

    // ✅ Test 3: Cargo not assigned after failure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.getCargo());
    }

    // ✅ Test 4: Program continues
    @Test
    void testCargo_ProgramContinuesAfterException() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        b.assignCargo("Petroleum"); // fails
        b.assignCargo("Coal");      // should work

        assertEquals("Coal", b.getCargo());
    }

    // ✅ Test 5: Finally block always executes
    @Test
    void testCargo_FinallyBlockExecution() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        assertDoesNotThrow(() -> {
            b.assignCargo("Petroleum");
        });
    }
}