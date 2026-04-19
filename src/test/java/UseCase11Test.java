import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11Test {

    @Test
    void testValidTrainId() {
        assertTrue(UseCase11.validateTrainId("TRN-1234"));
    }

    @Test
    void testInvalidTrainId() {
        assertFalse(UseCase11.validateTrainId("TRN123"));
    }

    @Test
    void testValidCargoCode() {
        assertTrue(UseCase11.validateCargoCode("PET-AB"));
    }

    @Test
    void testInvalidCargoCode() {
        assertFalse(UseCase11.validateCargoCode("pet-ab"));
    }

    @Test
    void testEmptyInput() {
        assertFalse(UseCase11.validateTrainId(""));
        assertFalse(UseCase11.validateCargoCode(""));
    }
}