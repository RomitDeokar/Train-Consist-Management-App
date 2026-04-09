import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // Step 1: Unsorted array (real-world case)
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        // Step 2: Sort before binary search (IMPORTANT)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Step 3: Search key
        String searchKey = "BG309";

        // Step 4: Binary Search
        boolean found = binarySearch(bogieIds, searchKey);

        // Step 5: Result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }
    }

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true; // Found
            }
            else if (result < 0) {
                low = mid + 1; // Search right
            }
            else {
                high = mid - 1; // Search left
            }
        }

        return false; // Not found
    }
}