package Array.sample2;

import java.util.ArrayList;
import java.util.List;


/**
 * ArrayListSample2
 */
public class ArrayListSample2 {

    public static void main(String[] args) {
        List<String> groceries = new ArrayList<String>();


        groceries.add("apple");
        groceries.add("banana");
        groceries.add("carrots");
        groceries.add("olive oil");
        groceries.add("avocados");

        // print lenght of array 
       System.out.println("Number of groceries : "+groceries.size());

       for (String item : groceries) {
        System.out.print(item+", ");
       }
       System.out.println();
    

       System.out.println("groceries item at item index 3 : "+groceries.get(3));

       // System.out.println("groceries : "groceries.get);
       groceries.remove(3);

        // print lenght of array 
        System.out.println("Number of groceries : "+groceries.size());

        for (String item : groceries) {
            System.out.print(item+", ");
           }
    System.out.println();
    }
}