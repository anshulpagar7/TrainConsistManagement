public class UseCase16 {

    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        bubbleSort(capacities);

        System.out.println("\nSorted:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }

    // method for testing
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}