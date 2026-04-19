import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase7Test {

    @Test
    void testUniqueAddition() {
        Set<String> bogies = new HashSet<>();

        UseCase7.addBogie(bogies, "BG101");
        UseCase7.addBogie(bogies, "BG101");

        assertEquals(1, bogies.size());
    }

    @Test
    void testMultipleUniqueBogies() {
        Set<String> bogies = new HashSet<>();

        UseCase7.addBogie(bogies, "BG101");
        UseCase7.addBogie(bogies, "BG102");

        assertEquals(2, bogies.size());
    }

    @Test
    void testSetNotNull() {
        Set<String> bogies = new HashSet<>();

        Set<String> result = UseCase7.addBogie(bogies, "BG101");

        assertNotNull(result);
    }
}