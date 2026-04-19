public class UseCase15 {

    // runtime exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                // rule: Rectangular cannot carry Petroleum
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Validation completed for " + shape);
            }
        }
    }

    public static void main(String[] args) {

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");
    }
}