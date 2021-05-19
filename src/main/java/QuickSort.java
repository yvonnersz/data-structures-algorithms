public class QuickSort {
    public static void quickSort(int[] numbersArr) {
        int leftIndex = 0;
        int rightIndex = numbersArr.length - 1;

        quickSort(numbersArr, leftIndex, rightIndex);
    }

    public static void quickSort(int[] numbersArr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) return;

        int pivotIndex = (leftIndex + rightIndex) / 2;
        int index = partition(numbersArr, leftIndex, rightIndex, pivotIndex);

        quickSort(numbersArr, leftIndex, index - 1);
        quickSort(numbersArr, index, rightIndex);
    }

    public static int partition(int[] numbersArr, int leftIndex, int rightIndex, int pivotIndex) {
        while (leftIndex <= rightIndex) {
            while (numbersArr[leftIndex] < numbersArr[pivotIndex]) {
                leftIndex ++;
            }

            while (numbersArr[rightIndex] > numbersArr[pivotIndex]) {
                rightIndex --;
            }

            if (leftIndex <= rightIndex) {
                swap(numbersArr, leftIndex, rightIndex);
                leftIndex ++;
                rightIndex --;
            }
        }

        return leftIndex;
    }

    public static void swap(int[] numbersArr, int leftIndex, int rightIndex) {
        int originalLeft = numbersArr[leftIndex];
        numbersArr[leftIndex] = numbersArr[rightIndex];
        numbersArr[rightIndex] = originalLeft;
    }
}
