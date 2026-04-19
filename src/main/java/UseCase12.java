import java.util.*;

public class UseCase12 {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        List<GoodsBogie> list = new ArrayList<>();

        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Open", "Coal"));

        boolean safe = isTrainSafe(list);

        System.out.println("Is Train Safe: " + safe);
    }

    // method for testing
    public static boolean isTrainSafe(List<GoodsBogie> list) {
        return list.stream()
                .allMatch(g -> !g.type.equals("Cylindrical") || g.cargo.equals("Petroleum"));
    }
}