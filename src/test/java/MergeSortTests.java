import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MergeSortTests {
    private MergeSort numbers;

    @BeforeEach
    void setup() {
        numbers = new MergeSort();
    }

    @Test
    void mergeSortClassExists() {
        try {
            Class.forName("MergeSort");
        } catch (Exception e) {
            fail("MergeSort class should exist");
        }
    }

    @Test
    void mergeSort_emptyParams_returnsEmptyArray() {
        int[] numbersArr = new int[]{};
        numbers.mergeSort(numbersArr);

        assertArrayEquals(new int[]{}, numbersArr, "Returns empty array if empty array is passed");
    }

    @Test
    void mergeSort_oneIntegerArrayParams_returnsPassedInteger() {
        int[] numbersArr = new int[]{3};
        numbers.mergeSort(numbersArr);

        assertArrayEquals(new int[]{3}, numbersArr, "Returns single integer array when one integer is passed");
    }

    @Test
    void mergeSort_twoIntegerArrayParams_returnsSortedArray() {
        int[] numbersArr = new int[] {9, 2};

        int[] expected = new int[] {2, 9};
        numbers.mergeSort(numbersArr);

        assertArrayEquals(expected, numbersArr, "Returns sorted array when two integers are passed");
    }

    @Test
    void mergeSort_threeIntegerArrayParams_returnsSortedArray() {
        int[] numbersArr = new int[] {9, 2, 1};

        int[] expected = new int[] {1, 2, 9};
        numbers.mergeSort(numbersArr);

        assertArrayEquals(expected, numbersArr, "Returns sorted array when three integers are passed");
    }

    @Test
    void mergeSort_multipleIntegerArrayParams_returnsSortedArray() {
        int[] numbersArr = new int[] {9, 2, 1, 0, -4, 10};

        int[] expected = new int[] {-4, 0, 1, 2, 9, 10};
        numbers.mergeSort(numbersArr);

        assertArrayEquals(expected, numbersArr, "Returns sorted array when multiple integers are passed");
    }
}
