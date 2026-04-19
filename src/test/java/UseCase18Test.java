import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase18Test {

    @Test
    void testFound() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assertTrue(UseCase18.search(arr, "BG309"));
    }

    @Test
    void testNotFound() {
        String[] arr = {"BG101", "BG205"};
        assertFalse(UseCase18.search(arr, "BG999"));
    }

    @Test
    void testEmptyArray() {
        String[] arr = {};
        assertFalse(UseCase18.search(arr, "BG101"));
    }
}