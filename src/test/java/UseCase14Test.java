import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14Test {

    @Test
    void testValidCapacity() throws Exception {
        UseCase14.PassengerBogie b =
                new UseCase14.PassengerBogie("Sleeper", 50);

        assertEquals(50, b.capacity);
    }

    @Test
    void testInvalidCapacity() {
        assertThrows(
                UseCase14.InvalidCapacityException.class,
                () -> new UseCase14.PassengerBogie("AC", -10)
        );
    }

    @Test
    void testZeroCapacity() {
        assertThrows(
                UseCase14.InvalidCapacityException.class,
                () -> new UseCase14.PassengerBogie("AC", 0)
        );
    }
}