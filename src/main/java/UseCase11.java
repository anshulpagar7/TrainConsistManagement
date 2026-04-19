import java.util.regex.Pattern;

public class UseCase11 {

    private static final String TRAIN_REGEX = "TRN-\\d{4}";
    private static final String CARGO_REGEX = "[A-Z]{3}-[A-Z]{2}";

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID Valid: " + validateTrainId(trainId));
        System.out.println("Cargo Code Valid: " + validateCargoCode(cargoCode));
    }

    // methods for testing
    public static boolean validateTrainId(String id) {
        return Pattern.matches(TRAIN_REGEX, id);
    }

    public static boolean validateCargoCode(String code) {
        return Pattern.matches(CARGO_REGEX, code);
    }
}