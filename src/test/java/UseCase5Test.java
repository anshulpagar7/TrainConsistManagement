import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase5Test {

    @Test
    void testUpdateExistingBogie() {
        String[] bogies = {"BG101", "BG102", "BG103"};
        String[] result = UseCase5.updateBogie(bogies, "BG102", "BG202");

        assertEquals("BG202", result[1]);
    }

    @Test
    void testUpdateNonExistingBogie() {
        String[] bogies = {"BG101", "BG102"};
        String[] result = UseCase5.updateBogie(bogies, "BG999", "BG200");

        assertEquals("BG101", result[0]);
        assertEquals("BG102", result[1]);
    }

    @Test
    void testUpdateEmptyArray() {
        String[] bogies = {};
        String[] result = UseCase5.updateBogie(bogies, "BG101", "BG200");

        assertEquals(0, result.length);
    }
}