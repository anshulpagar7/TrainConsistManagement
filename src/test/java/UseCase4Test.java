import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase4Test {

    @Test
    void testRemoveExistingBogie() {
        String[] bogies = {"BG101", "BG102", "BG103"};
        String[] result = UseCase4.removeBogie(bogies, "BG102");

        assertEquals(2, result.length);
        assertEquals("BG101", result[0]);
        assertEquals("BG103", result[1]);
    }

    @Test
    void testRemoveNonExistingBogie() {
        String[] bogies = {"BG101", "BG102"};
        String[] result = UseCase4.removeBogie(bogies, "BG999");

        assertEquals(2, result.length);
    }

    @Test
    void testRemoveFromEmptyArray() {
        String[] bogies = {};
        String[] result = UseCase4.removeBogie(bogies, "BG101");

        assertEquals(0, result.length);
    }
}