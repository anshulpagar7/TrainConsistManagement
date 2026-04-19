import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase2Test {

    @Test
    void testBogieFound() {
        String[] bogies = {"BG101", "BG102", "BG103"};
        assertTrue(UseCase2.searchBogie(bogies, "BG102"));
    }

    @Test
    void testBogieNotFound() {
        String[] bogies = {"BG101", "BG102", "BG103"};
        assertFalse(UseCase2.searchBogie(bogies, "BG999"));
    }

    @Test
    void testEmptyArray() {
        String[] bogies = {};
        assertFalse(UseCase2.searchBogie(bogies, "BG101"));
    }
}