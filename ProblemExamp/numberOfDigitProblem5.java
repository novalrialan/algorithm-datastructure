package ProblemExamp;

/**
 * Soal 2: Menghitung Jumlah Digit
 * 
 * Deskripsi: Buatlah sebuah program yang menerima input berupa bilangan bulat
 * dan menghitung jumlah digit dalam bilangan tersebut.
 * 
 * Contoh:
 * 
 * Input: 12345
 * Output: Jumlah digit: 5
 * Input: 1001
 * Output: Jumlah digit: 4
 */
public class numberOfDigitProblem5 {

    public static Integer countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("result input 1 number of digits : " + countDigits(12300));
        System.out.println("result input 2 number of digits : " + countDigits(1001));
    }
}
