package CaseStudy;

public class ArraySortingValue {

    public static int[] getEvenNumbers(int[] numbers) {
        int count = 0;
        // count amount evenNumber
        for (int number : numbers) {
            // selection eveNumber
            if (number % 2 == 0) {
                count++;
            }
        }

        // create object evenNumber
        int[] evenNumbers = new int[count];
        // define counter index value 0
        int index = 0;
        // fuel evenNumber with object
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index++] = number;
            }
        }
        return evenNumbers;
    }

    public static int[] getOddNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }

        int[] oddNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {

                oddNumbers[index++] = number;
            }
        }
        return oddNumbers;

    }

    public static void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] \n");
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 4, 10, 15, 18, 21, 24, 35 };

        int[] evenNumbers = getEvenNumbers(numbers);
        System.out.print("EvenNumbers : ");
        displayArray(evenNumbers);

        int[] oddNumbers = getOddNumbers(numbers);
        System.out.print("OddNumbers : ");
        displayArray(oddNumbers);
    }
}
