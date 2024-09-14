package CaseStudy;

public class ArraySortingPlusAndMinValue {

    public static int[] getEvenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;

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

    public static int[] getNegativeNumbers(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }

        int[] negativeNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativeNumbers[index++] = number;
            }
        }
        return negativeNumbers;
    }

    public static void displayArray(int[] arrays) {
        System.out.print("[");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
            if (i < arrays.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int[] numbers = { -3, 4, -7, 10, 15, -18, 21, -24, 35 };

        int[] evenNumbers = getEvenNumbers(numbers);
        System.err.print("EvenNumbers : ");
        displayArray(evenNumbers);

        int[] oddNumbers = getOddNumbers(numbers);
        System.err.print("OddNumbers : ");
        displayArray(oddNumbers);

        int[] negativeNumbers = getNegativeNumbers(numbers);
        System.out.print("NegativeNumbers : ");
        displayArray(negativeNumbers);

    }
}
