public class MergeSort {
    public static void mergeSort(int[] numbers) {
        int leftStart = 0;
        int rightEnd = numbers.length - 1;
        int[] tempArray = new int[numbers.length];

        mergeSort(numbers, tempArray, leftStart, rightEnd);
    }

    public static void mergeSort(int[] numbers, int[] tempArray, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) return;

        int middleIndex = (leftStart + rightEnd) / 2;

        mergeSort(numbers, tempArray, leftStart, middleIndex);
        mergeSort(numbers, tempArray, middleIndex + 1, rightEnd);
        merge(numbers, tempArray, leftStart, rightEnd);
    }

    public static void merge(int[] numbers, int[] tempArray, int leftStart, int rightEnd) {
        int middleIndex = (leftStart + rightEnd) / 2;
        int rightStart = middleIndex + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= middleIndex && right <= rightEnd) {
            if (numbers[left] < numbers[right]) {
                tempArray[index] = numbers[left];
                left++;
            } else {
                tempArray[index] = numbers[right];
                right++;
            }

            index++;
        }

        System.arraycopy(numbers, left, tempArray, index, middleIndex - left + 1);
        System.arraycopy(numbers, right, tempArray, index, rightEnd - right + 1);
        System.arraycopy(tempArray, leftStart, numbers, leftStart, size);
    }
}
