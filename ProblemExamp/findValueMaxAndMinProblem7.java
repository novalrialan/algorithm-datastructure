package ProblemExamp;

public class findValueMaxAndMinProblem7 {

    public static Integer findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static Integer findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 5, 7, 2, 8, -1, 4, 10, 12 };

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Value Maximum : " + max);
        System.out.println("Value Minimum : " + min);
    }

}
