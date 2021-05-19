import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class BubbleSortTests {
    @Test
    void bubbleSortClassExists() {
        try {
            Class.forName("BubbleSort");
        } catch (Exception e) {
            fail("BubbleSort class should exist");
        }
    }
}
