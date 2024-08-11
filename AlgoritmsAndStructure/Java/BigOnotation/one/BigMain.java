package BigOnotation.one;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BigMain {

    public static void main(String[] args) {
        // exam --> 1
        // int[] numbers = { 10, 20, 30 };
        // System.out.println(numbers.length);
        // System.out.println(Arrays.toString(numbers));

        // exam --> 2
        // Integer[] numbers = (Integer[]) Array.newInstance(Integer.class, 3);

        // Array.set(numbers, 0, 1);
        // Array.set(numbers, 1, 2);
        // Array.set(numbers, 2, 3);

        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(Array.get(numbers, i));
        // }

        // exam --> 3
        // Create an array of integers with 3 elements
        // Alternatively, you can initialize the array at the time of declaration

        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        printArray(numbers);
        System.out.println("index baru sudah ditambahkan");
        numbers = add(numbers, 90);
        printArray(numbers);

        System.out.println("sudah terjadi penghapusan index pertama");
        numbers = remove(numbers, 2);
        printArray(numbers);

        System.out.println("sudah terjadi penghapusan index kedua");
        numbers = remove(numbers, 3);
        printArray(numbers);

    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.err.println();

    }

    public static int[] add(int[] array, int newElement) {

        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = newElement;
        return newArray;
    }

    public static int[] remove(int[] array, int index) {

        if (index < 0 || index >= array.length) {
            System.out.println("Index out of bounds");
            return array;
        }

        // --- long consept delete ---
        // Create a new array with one less element
        // int[] newArray = new int[array.length - 1];

        // // Copy elements up to the index to be removed
        // for (int i = 0; i < index; i++) {
        // newArray[i] = array[i];
        // }

        // // Skip the element at the index to be removed and copy the rest
        // for (int x = index; x < array.length - 1; x++) {
        // newArray[x] = array[x + 1];
        // }

        // return newArray;

        int[] arr = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            arr[i] = array[i];
        }
        for (int x = index; x < array.length - 1; x++) {
            arr[x] = array[x + 1];
        }

        return arr;
    }

}
