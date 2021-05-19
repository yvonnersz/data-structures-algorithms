import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void bubbleSort_emptyParams_returnsEmptyArray() {
        int[] numbersArr = new int[]{};
        numbers.bubbleSort(numbersArr);

        assertArrayEquals(new int[]{}, numbersArr, "Returns empty array if empty array is passed");
    }

    @Test
    void bubbleSort_oneIntegerArrayParams_returnsPassedInteger() {
        int[] numbersArr = new int[]{3};
        numbers.bubbleSort(numbersArr);

        assertArrayEquals(new int[]{3}, numbersArr, "Returns single integer array when one integer is passed");
    }

    @Test
    void bubbleSort_twoIntegerArrayParams_returnsSortedArray() {
        int[] numbersArr = new int[] {9, 2};

        int[] expected = new int[] {2, 9};
        numbers.bubbleSort(numbersArr);

        assertArrayEquals(expected, numbersArr, "Returns sorted array when two integers are passed");
    }

    @Test
    void bubbleSort_threeIntegerArrayParams_returnsSortedArray() {
        int[] numbersArr = new int[] {9, 2, 1};

        int[] expected = new int[] {1, 2, 9};
        numbers.bubbleSort(numbersArr);

        assertArrayEquals(expected, numbersArr, "Returns sorted array when three integers are passed");
    }

    @Test
    void bubbleSort_multipleIntegerArrayParams_returnsSortedArray() {
        int[] numbersArr = new int[] {9, 2, 1, 0, -4, 10};

        int[] expected = new int[] {-4, 0, 1, 2, 9, 10};
        numbers.bubbleSort(numbersArr);

        assertArrayEquals(expected, numbersArr, "Returns sorted array when multiple integers are passed");
    }
}
