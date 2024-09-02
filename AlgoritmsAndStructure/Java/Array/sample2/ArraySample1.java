package Array.sample2;

/**
 * ArraySample1
 */
public class ArraySample1 {

    
    public static void main(String[] args) {
        
        // intialize groceries
        String [] groceries = {"apple","banana","carrots","olive oil","avocado"};

        // print lenght of array 
        System.out.println("Number of groceries : "+groceries.length);

        // print out all groceries

        for (String item : groceries) {
            System.out.print(item+", ");
        }
        System.out.println();

        // retrieve element in constant time
        System.out.println("groceries item at index 3 : "+ groceries[3]);

        // remove element
        groceries[3] = null;    

        // check
        System.out.println("Number of groceries : "+groceries.length);

        for (String item : groceries) {
            System.out.print(item+", ");
        }
        System.out.println();


    }
}