import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase13Test {

    @Test
    void testLoopFiltering() {

        List<UseCase13.Bogie> list = Arrays.asList(
                new UseCase13.Bogie("BG1", 50),
                new UseCase13.Bogie("BG2", 70)
        );

        List<UseCase13.Bogie> result =
                UseCase13.filterUsingLoop(list);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFiltering() {

        List<UseCase13.Bogie> list = Arrays.asList(
                new UseCase13.Bogie("BG1", 50),
                new UseCase13.Bogie("BG2", 80)
        );

        List<UseCase13.Bogie> result =
                UseCase13.filterUsingStream(list);

        assertEquals(1, result.size());
    }

    @Test
    void testBothMethodsSameResult() {

        List<UseCase13.Bogie> list = Arrays.asList(
                new UseCase13.Bogie("BG1", 70),
                new UseCase13.Bogie("BG2", 80)
        );

        int loopSize = UseCase13.filterUsingLoop(list).size();
        int streamSize = UseCase13.filterUsingStream(list).size();

        assertEquals(loopSize, streamSize);
    }
}