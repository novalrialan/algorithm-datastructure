package ProblemExamp;

/**
 * 
 * Soal 1: Menentukan Bilangan Prima
 * 
 * Deskripsi: Buatlah sebuah program yang menerima input berupa bilangan bulat
 * positif dan menentukan apakah bilangan tersebut adalah bilangan prima atau
 * bukan. Bilangan prima adalah bilangan yang hanya memiliki dua faktor: 1 dan
 * dirinya sendiri.
 * 
 * Contoh:
 * 
 * Input: 7
 * Output: 7 adalah bilangan prima
 * Input: 10
 * Output: 10 bukan bilangan prima
 */
public class primenumberproblem4 {

    public static boolean isPrime(int number) {

        // Bilangan kurang dari 2 bukan bilangan prima
        if (number < 2) {
            return false;
        }

        // Memeriksa faktor dari 2 sampai akar kuadrat dari bilangan
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        // Jika tidak ada faktor selain 1 dan dirinya sendiri, bilangan adalah prima
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(Math.sqrt(49));
        int number = 5;
        if (isPrime(number)) {
            System.out.println(number + " adalah bilangan prima");
        } else {
            System.out.println(number + " bukan bilangan prima");

        }
    }
}
