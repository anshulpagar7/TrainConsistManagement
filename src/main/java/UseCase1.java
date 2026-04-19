public class UseCase1 {

    public static void main(String[] args) {
        String[] bogies = {"BG101", "BG102", "BG103"};

        System.out.println("Train Bogie List:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }
    }

    public static int getBogieCount(String[] arr) {
        return arr.length;
    }
}