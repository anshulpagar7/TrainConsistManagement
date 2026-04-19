import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase17Test {

    @Test
    void testSorting() {
        String[] arr = {"Sleeper", "AC", "General"};

        UseCase17.sortNames(arr);

        assertArrayEquals(new String[]{"AC", "General", "Sleeper"}, arr);
    }

    @Test
    void testAlreadySorted() {
        String[] arr = {"AC", "General"};

        UseCase17.sortNames(arr);

        assertArrayEquals(new String[]{"AC", "General"}, arr);
    }

    @Test
    void testSingleElement() {
        String[] arr = {"Sleeper"};

        UseCase17.sortNames(arr);

        assertArrayEquals(new String[]{"Sleeper"}, arr);
    }
}