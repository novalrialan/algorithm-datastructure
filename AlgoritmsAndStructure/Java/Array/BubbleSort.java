package Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 4, 2, 0, 11 };
        bubbleSort(array);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        int n = array.length;
        int swapCounter = 0;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap array[i] and array[i+1]
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                    swapCounter++;
                    System.err.println("default = " + swapCounter);
                }
            }
        } while (swapped);

        System.out.println("Number of swaps: " + swapCounter);
    }
}
