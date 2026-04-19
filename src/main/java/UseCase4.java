public class UseCase4 {

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG102", "BG103"};
        String removeId = "BG102";

        String[] updated = removeBogie(bogies, removeId);

        System.out.println("Updated Bogie List:");
        for (String b : updated) {
            System.out.println(b);
        }
    }

    // method for testing
    public static String[] removeBogie(String[] arr, String key) {

        int count = 0;

        // count elements not equal to key
        for (String b : arr) {
            if (!b.equals(key)) {
                count++;
            }
        }

        String[] newArr = new String[count];
        int index = 0;

        for (String b : arr) {
            if (!b.equals(key)) {
                newArr[index++] = b;
            }
        }

        return newArr;
    }
}