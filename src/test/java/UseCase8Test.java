import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase8Test {

    @Test
    void testFilterAboveThreshold() {

        List<UseCase8.Bogie> list = Arrays.asList(
                new UseCase8.Bogie("BG101", 50),
                new UseCase8.Bogie("BG102", 70)
        );

        List<UseCase8.Bogie> result =
                UseCase8.filterBogies(list, 60);

        assertEquals(1, result.size());
        assertEquals("BG102", result.get(0).name);
    }

    @Test
    void testFilterNoMatch() {

        List<UseCase8.Bogie> list = Arrays.asList(
                new UseCase8.Bogie("BG101", 40)
        );

        List<UseCase8.Bogie> result =
                UseCase8.filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testEmptyList() {

        List<UseCase8.Bogie> list = new ArrayList<>();

        List<UseCase8.Bogie> result =
                UseCase8.filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }
}