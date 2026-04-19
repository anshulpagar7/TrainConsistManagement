public class UseCase2 {

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG102", "BG103"};
        String searchId = "BG102";

        boolean found = false;

        for (String bogie : bogies) {
            if (bogie.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }

    // method for testing
    public static boolean searchBogie(String[] arr, String key) {
        for (String bogie : arr) {
            if (bogie.equals(key)) {
                return true;
            }
        }
        return false;
    }
}