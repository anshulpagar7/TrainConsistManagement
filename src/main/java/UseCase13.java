import java.util.*;
import java.util.stream.Collectors;

public class UseCase13 {

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

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("BG" + i, i % 100));
        }

        long startLoop = System.nanoTime();
        filterUsingLoop(bogies);
        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();
        filterUsingStream(bogies);
        long endStream = System.nanoTime();

        System.out.println("Loop Time: " + (endLoop - startLoop));
        System.out.println("Stream Time: " + (endStream - startStream));
    }

    // loop method
    public static List<Bogie> filterUsingLoop(List<Bogie> list) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : list) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // stream method
    public static List<Bogie> filterUsingStream(List<Bogie> list) {
        return list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }
}