import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase1Test {

    @Test
    void testBogieCount() {
        String[] bogies = {"BG101", "BG102", "BG103"};
        assertEquals(3, UseCase1.getBogieCount(bogies));
    }

    @Test
    void testEmptyList() {
        String[] bogies = {};
        assertEquals(0, UseCase1.getBogieCount(bogies));
    }
}