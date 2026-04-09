public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe
        b1.assignCargo("Petroleum");

        // ❌ Unsafe
        b2.assignCargo("Petroleum");

        // ✅ Another safe
        b2.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}