import java.util.*;
import java.util.stream.Collectors;

public class UseCase8 {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", 50));
        bogies.add(new Bogie("BG102", 70));
        bogies.add(new Bogie("BG103", 80));

        List<Bogie> filtered = filterBogies(bogies, 60);

        System.out.println("Filtered Bogies (capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }

    // method for testing
    public static List<Bogie> filterBogies(List<Bogie> list, int threshold) {
        return list.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }
}