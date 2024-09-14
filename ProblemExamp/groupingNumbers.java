package ProblemExamp;

/**
 * groupingNumbers
 */
public class groupingNumbers {

    public static int[] grouping(int[] numbers) {

        int count = 0;
        int less = 0;
        for (int number : numbers) {
            if (number % 2 == 0 ) {
                count++;
            }
            else if(number % 2 != 0){
                less++;
            }
        }

        int[] firstElementSelection = new int[count];

        
        int[] secondElementSelection = new int[less];
        int index = 0;
        // int temp =0;
        for (int number : numbers) {
            if (number % 2 == 0 ) {

                
            firstElementSelection[index++] = number;

               
            } else if (number % 2 != 0 ) {
                secondElementSelection[less++] = number;

                for (int i = 0; i < secondElementSelection.length; i++) {
                    
                    firstElementSelection[i] = secondElementSelection[i];
                }
            }

        }

        // Arrays.sort(firstElementSelection);

        return firstElementSelection;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
            
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] numbers = {
            4, 5, 6, 5, 4, 3, // 6 elemen asli
            7, 8, 9, 10, 11, 12, // 6 elemen tambahan
            13, 14, 15, 16, 17, 18, // 6 elemen tambahan
            19, 20, 21 // 3 elemen tambahan
        };

        int[] input = grouping(numbers);
        printArray(input);
    }
}
