import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase3Test {

    @Test
    void testAddBogie() {
        String[] bogies = {"BG101", "BG102"};
        String[] result = UseCase3.addBogie(bogies, "BG103");

        assertEquals(3, result.length);
        assertEquals("BG103", result[2]);
    }

    @Test
    void testAddToEmptyArray() {
        String[] bogies = {};
        String[] result = UseCase3.addBogie(bogies, "BG101");

        assertEquals(1, result.length);
        assertEquals("BG101", result[0]);
    }

    @Test
    void testOriginalElementsRemain() {
        String[] bogies = {"BG101", "BG102"};
        String[] result = UseCase3.addBogie(bogies, "BG103");

        assertEquals("BG101", result[0]);
        assertEquals("BG102", result[1]);
    }
}