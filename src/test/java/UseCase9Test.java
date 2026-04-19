import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase9Test {

    @Test
    void testGrouping() {

        List<UseCase9.Bogie> list = Arrays.asList(
                new UseCase9.Bogie("Sleeper", 72),
                new UseCase9.Bogie("Sleeper", 70)
        );

        Map<String, List<UseCase9.Bogie>> result =
                UseCase9.groupBogies(list);

        assertEquals(1, result.size());
        assertTrue(result.containsKey("Sleeper"));
    }

    @Test
    void testMultipleGroups() {

        List<UseCase9.Bogie> list = Arrays.asList(
                new UseCase9.Bogie("Sleeper", 72),
                new UseCase9.Bogie("AC", 56)
        );

        Map<String, List<UseCase9.Bogie>> result =
                UseCase9.groupBogies(list);

        assertEquals(2, result.size());
    }

    @Test
    void testEmptyList() {

        List<UseCase9.Bogie> list = new ArrayList<>();

        Map<String, List<UseCase9.Bogie>> result =
                UseCase9.groupBogies(list);

        assertTrue(result.isEmpty());
    }
}