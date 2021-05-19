import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class BubbleSortTests {
    private BubbleSort numbers;

    @BeforeEach
    void setup() {
        numbers = new BubbleSort();
    }

    @Test
    void bubbleSortClassExists() {
        try {
            Class.forName("BubbleSort");
        } catch (Exception e) {
            fail("BubbleSort class should exist");
        }
    }
}
