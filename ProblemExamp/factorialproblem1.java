package ProblemExamp;

/**
 * Soal 1: Membuat Program Penghitung Faktor Bilangan
 * Deskripsi: Buatlah sebuah program yang menerima input berupa bilangan bulat
 * positif dari pengguna dan menampilkan semua faktor dari bilangan tersebut.
 * Faktor adalah bilangan yang dapat membagi habis bilangan tersebut tanpa
 * menyisakan sisa.
 * 
 * Contoh:
 * 
 * Input: 12
 * Output: 1, 2, 3, 4, 6, 12
 */
public class factorialproblem1 {

    public static Integer factorial(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + ", ");
            }
        }
        return number;
    }

    public static void main(String[] args) {

        factorialproblem1 bil = new factorialproblem1();
        bil.factorial(12);
    }
}