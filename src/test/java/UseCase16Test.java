import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16Test {

    @Test
    void testSorting() {
        int[] arr = {72, 56, 24, 70, 60};

        UseCase16.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {10, 20, 30};

        UseCase16.bubbleSort(arr);

        assertArrayEquals(new int[]{10, 20, 30}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {50};

        UseCase16.bubbleSort(arr);

        assertArrayEquals(new int[]{50}, arr);
    }
}