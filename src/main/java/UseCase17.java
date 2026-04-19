import java.util.Arrays;

public class UseCase17 {

    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC", "General", "Luxury"};

        System.out.println("Original:");
        System.out.println(Arrays.toString(bogies));

        Arrays.sort(bogies);

        System.out.println("Sorted:");
        System.out.println(Arrays.toString(bogies));
    }

    // method for testing
    public static void sortNames(String[] arr) {
        Arrays.sort(arr);
    }
}