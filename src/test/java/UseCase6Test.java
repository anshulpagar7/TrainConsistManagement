import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase6Test {

    @Test
    void testAddBogie() {
        List<String> bogies = new ArrayList<>();
        bogies.add("BG101");

        List<String> result = UseCase6.addBogie(bogies, "BG102");

        assertEquals(2, result.size());
        assertTrue(result.contains("BG102"));
    }

    @Test
    void testAddToEmptyList() {
        List<String> bogies = new ArrayList<>();

        List<String> result = UseCase6.addBogie(bogies, "BG101");

        assertEquals(1, result.size());
    }

    @Test
    void testListNotNull() {
        List<String> bogies = new ArrayList<>();

        List<String> result = UseCase6.addBogie(bogies, "BG101");

        assertNotNull(result);
    }
}