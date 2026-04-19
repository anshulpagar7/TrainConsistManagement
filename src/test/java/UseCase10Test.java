import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase10Test {

    @Test
    void testTotalCapacity() {

        List<UseCase10.Bogie> list = Arrays.asList(
                new UseCase10.Bogie("BG101", 50),
                new UseCase10.Bogie("BG102", 30)
        );

        int result = UseCase10.totalCapacity(list);

        assertEquals(80, result);
    }

    @Test
    void testEmptyList() {

        List<UseCase10.Bogie> list = new ArrayList<>();

        int result = UseCase10.totalCapacity(list);

        assertEquals(0, result);
    }

    @Test
    void testSingleBogie() {

        List<UseCase10.Bogie> list = Arrays.asList(
                new UseCase10.Bogie("BG101", 40)
        );

        int result = UseCase10.totalCapacity(list);

        assertEquals(40, result);
    }
}