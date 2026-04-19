public class UseCase20 {

    public static void main(String[] args) {

        String[] bogieIds = {};
        String searchId = "BG101";

        boolean found = searchWithValidation(bogieIds, searchId);

        System.out.println(found ? "Bogie Found" : "Bogie Not Found");
    }

    // method for testing
    public static boolean searchWithValidation(String[] arr, String key) {

        // fail-fast validation
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search."
            );
        }

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }
}