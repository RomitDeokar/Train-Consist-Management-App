import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistAppTest {

    @Test
    void testBinarySearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        Arrays.sort(arr);

        assertTrue(TrainConsistApp.binarySearch(arr, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        Arrays.sort(arr);

        assertFalse(TrainConsistApp.binarySearch(arr, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        Arrays.sort(arr);

        assertTrue(TrainConsistApp.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        Arrays.sort(arr);

        assertTrue(TrainConsistApp.binarySearch(arr, "BG309"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};
        Arrays.sort(arr);

        assertTrue(TrainConsistApp.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] arr = {};

        assertFalse(TrainConsistApp.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {"BG309","BG101","BG550","BG205","BG412"};
        Arrays.sort(arr);

        assertTrue(TrainConsistApp.binarySearch(arr, "BG205"));
    }
}