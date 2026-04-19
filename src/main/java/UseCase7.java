import java.util.HashSet;
import java.util.Set;

public class UseCase7 {

    public static void main(String[] args) {

        Set<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");

        // adding duplicates
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Unique Bogie IDs:");
        for (String b : bogies) {
            System.out.println(b);
        }
    }

    // method for testing
    public static Set<String> addBogie(Set<String> set, String bogie) {
        set.add(bogie);
        return set;
    }
}