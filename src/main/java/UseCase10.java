import java.util.*;

public class UseCase10 {

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

        bogies.add(new Bogie("BG101", 72));
        bogies.add(new Bogie("BG102", 56));
        bogies.add(new Bogie("BG103", 24));

        int total = totalCapacity(bogies);

        System.out.println("Total Capacity: " + total);
    }

    // method for testing
    public static int totalCapacity(List<Bogie> list) {
        return list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }
}