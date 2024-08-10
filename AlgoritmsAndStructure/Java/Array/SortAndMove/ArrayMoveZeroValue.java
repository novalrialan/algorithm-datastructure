package Array.SortAndMove;

import java.util.Arrays;

public class ArrayMoveZeroValue {

    public static void main(String[] args) {
        int data[] = { 8, 1, 0, 2, 1, 0, 3 };
        moveZeros(data, 7);
        int size = data.length;

        // Print the array after moving zeros

        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }

    }

    public static void moveZeros(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }
}
