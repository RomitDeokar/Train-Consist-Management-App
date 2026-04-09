public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Step 1: Create array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        // Step 2: Search key
        String searchKey = "BG309";

        // Step 3: Call search function
        boolean found = linearSearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }
    }

    // Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        for (int i = 0; i < arr.length; i++) {

            // Compare using equals()
            if (arr[i].equals(key)) {
                return true; // Early stop
            }
        }

        return false; // Not found
    }
}