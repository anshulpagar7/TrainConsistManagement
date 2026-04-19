public class UseCase18 {

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412"};
        String searchId = "BG309";

        boolean found = search(bogieIds, searchId);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }

    // method for testing
    public static boolean search(String[] arr, String key) {

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}