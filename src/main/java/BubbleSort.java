public class BubbleSort {
    public static void bubbleSort(int[] numbersArr) {
        for (int i = 0; i < numbersArr.length - 1; i++) {
            if (numbersArr[i] > numbersArr[i + 1]) {
                swap(numbersArr, i, i + 1);
            }
        }
    }

    public static void swap(int[] numbersArr, int left, int right) {
        int originalLeft = numbersArr[left];
        numbersArr[left] = numbersArr[right];
        numbersArr[right] = originalLeft;
    }
}
