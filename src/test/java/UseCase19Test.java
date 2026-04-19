import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19Test {

    @Test
    void testFound() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assertTrue(UseCase19.binarySearch(arr, "BG309"));
    }

    @Test
    void testNotFound() {
        String[] arr = {"BG101", "BG205"};
        assertFalse(UseCase19.binarySearch(arr, "BG999"));
    }

    @Test
    void testSingleElement() {
        String[] arr = {"BG101"};
        assertTrue(UseCase19.binarySearch(arr, "BG101"));
    }

    @Test
    void testEmptyArray() {
        String[] arr = {};
        assertFalse(UseCase19.binarySearch(arr, "BG101"));
    }
}