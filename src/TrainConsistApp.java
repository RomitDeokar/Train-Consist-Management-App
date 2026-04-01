import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===");

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // ❌ Try this to test failure:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Step 2: Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );

        // Step 3: Display bogies
        System.out.println("\nBogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // Step 4: Result
        if (isSafe) {
            System.out.println("\nTrain is SAFE ✅");
        } else {
            System.out.println("\nTrain is UNSAFE ❌");
        }
    }
}