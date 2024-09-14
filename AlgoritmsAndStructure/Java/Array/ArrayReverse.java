package Array;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] numbers = { 2, 11, 5, 10, 7, 8 };
        reverseArray(numbers, 6, numbers.length - 1);
        System.out.println("result = " + Arrays.toString(numbers));
    }

    public static void reverseArray(int numbers[], int start, int end) {
        while (start < end) {
            // Pertukaran elemen
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            // memberbaharui indeks
            start++;
            end--;
        }
    }

}
