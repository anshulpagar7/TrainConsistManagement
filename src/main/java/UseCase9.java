import java.util.*;
import java.util.stream.Collectors;

public class UseCase9 {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC", 60));

        Map<String, List<Bogie>> grouped = groupBogies(bogies);

        System.out.println("Grouped Bogies:");
        for (String key : grouped.keySet()) {
            System.out.println(key + ": " + grouped.get(key).size());
        }
    }

    // method for testing
    public static Map<String, List<Bogie>> groupBogies(List<Bogie> list) {
        return list.stream()
                .collect(Collectors.groupingBy(b -> b.type));
    }
}