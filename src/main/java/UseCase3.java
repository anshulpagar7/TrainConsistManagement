public class UseCase3 {

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG102", "BG103"};
        String newBogie = "BG104";

        String[] updated = addBogie(bogies, newBogie);

        System.out.println("Updated Bogie List:");
        for (String b : updated) {
            System.out.println(b);
        }
    }

    // method for testing
    public static String[] addBogie(String[] arr, String newBogie) {

        String[] newArr = new String[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = newBogie;

        return newArr;
    }
}