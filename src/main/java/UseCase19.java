import java.util.Arrays;

public class UseCase19 {

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412"};

        // ensure sorted
        Arrays.sort(bogieIds);

        String key = "BG309";

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }

    // method for testing
    public static boolean binarySearch(String[] arr, String key) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}