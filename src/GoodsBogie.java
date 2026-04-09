public class GoodsBogie {

    String type;   // Rectangular / Cylindrical
    String cargo;  // assigned later

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        try {
            // ❌ Unsafe condition
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Petroleum cannot be assigned to Rectangular bogie");
            }

            // ✅ Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " → " + type + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }

    public String getCargo() {
        return cargo;
    }
}