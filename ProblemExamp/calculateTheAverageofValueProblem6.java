package ProblemExamp;

public class calculateTheAverageofValueProblem6 {

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] number = { 3, 5, 7, 10 };

        double average = calculateAverage(number);
        System.out.println("Rata-rata : " + average);
    }
}
