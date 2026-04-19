public class UseCase5 {

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG102", "BG103"};
        String oldId = "BG102";
        String newId = "BG202";

        String[] updated = updateBogie(bogies, oldId, newId);

        System.out.println("Updated Bogie List:");
        for (String b : updated) {
            System.out.println(b);
        }
    }

    // method for testing
    public static String[] updateBogie(String[] arr, String oldId, String newId) {

        String[] newArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldId)) {
                newArr[i] = newId;
            } else {
                newArr[i] = arr[i];
            }
        }

        return newArr;
    }
}