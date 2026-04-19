import java.util.ArrayList;
import java.util.List;

public class UseCase6 {

    public static void main(String[] args) {

        List<String> bogies = new ArrayList<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");

        System.out.println("Train Bogies:");
        for (String b : bogies) {
            System.out.println(b);
        }
    }

    // method for testing
    public static List<String> addBogie(List<String> list, String bogie) {
        list.add(bogie);
        return list;
    }
}