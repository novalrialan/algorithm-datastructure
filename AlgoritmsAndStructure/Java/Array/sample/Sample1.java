package Array.sample;

import java.util.*;

public class Sample1 {
    public static void main(String[] args) {

        // exam --> 1
        // String[] arr = { "chicken", "bacon", "avocado" };

        // List<String> list = Arrays.asList(arr);

        // for (String s : list) {
        // System.out.println(s + " ");
        // }

        // exam --> 2
        // int[] arr = new int[5];

        // Arrays.fill(arr, 100); // using Array.fill for replace same array value int

        // for (Integer i : arr) {
        // System.out.println(i + " ");
        // }

        // exam --> 3
        // String[] arr = { "bacon", "zletture", "tomato" };
        // String[] arr2 = { "bacon", "letture", "tomato" };

        // int c = Arrays.compare(arr, arr2); // using Arrays.compare for between two
        // object looking deference

        // System.err.println(c);

        // if (c == 0) {
        // .. do something
        // } else if (c < 0) {

        // } else {

        // }

        // exam --> 4
        // int[] arr = { 8, 9, 12, 14, 9, 11 };

        // Arrays.sort(arr); // if you use parameter two can be compare object value int
        // arr

        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        // exam --> 5
        int[] arr = { 7, 8, 10, 10, 9, 19, 23 };
        System.err.println(Arrays.binarySearch(arr, 10)); // binarySearch use for searching data numerik in object array
    }
}
