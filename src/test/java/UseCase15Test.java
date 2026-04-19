import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15Test {

    @Test
    void testSafeAssignment() {
        UseCase15.GoodsBogie g =
                new UseCase15.GoodsBogie("Cylindrical");

        g.assignCargo("Petroleum");

        assertEquals("Petroleum", g.cargo);
    }

    @Test
    void testUnsafeAssignment() {
        UseCase15.GoodsBogie g =
                new UseCase15.GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");

        assertNull(g.cargo);
    }

    @Test
    void testProgramContinues() {
        UseCase15.GoodsBogie g1 =
                new UseCase15.GoodsBogie("Rectangular");

        UseCase15.GoodsBogie g2 =
                new UseCase15.GoodsBogie("Cylindrical");

        g1.assignCargo("Petroleum"); // error
        g2.assignCargo("Coal");      // should work

        assertEquals("Coal", g2.cargo);
    }
}