import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20Test {

    @Test
    void testThrowsWhenEmpty() {
        String[] arr = {};

        assertThrows(IllegalStateException.class, () ->
                UseCase20.searchWithValidation(arr, "BG101")
        );
    }

    @Test
    void testAllowsSearchWhenDataExists() {
        String[] arr = {"BG101", "BG205"};

        assertDoesNotThrow(() ->
                UseCase20.searchWithValidation(arr, "BG101")
        );
    }

    @Test
    void testFound() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(UseCase20.searchWithValidation(arr, "BG205"));
    }

    @Test
    void testNotFound() {
        String[] arr = {"BG101", "BG205"};

        assertFalse(UseCase20.searchWithValidation(arr, "BG999"));
    }
}