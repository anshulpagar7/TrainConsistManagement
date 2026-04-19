import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12Test {

    @Test
    void testValidCase() {

        List<UseCase12.GoodsBogie> list = Arrays.asList(
                new UseCase12.GoodsBogie("Cylindrical", "Petroleum"),
                new UseCase12.GoodsBogie("Open", "Coal")
        );

        assertTrue(UseCase12.isTrainSafe(list));
    }

    @Test
    void testInvalidCase() {

        List<UseCase12.GoodsBogie> list = Arrays.asList(
                new UseCase12.GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(UseCase12.isTrainSafe(list));
    }

    @Test
    void testEmptyList() {

        List<UseCase12.GoodsBogie> list = new ArrayList<>();

        assertTrue(UseCase12.isTrainSafe(list));
    }
}