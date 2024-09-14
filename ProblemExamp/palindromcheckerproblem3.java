package ProblemExamp;

/**
 * Soal 3: Membuat Program Palindrom
 * 
 * Deskripsi: Buatlah sebuah program yang menerima input berupa sebuah string
 * dari pengguna dan memeriksa apakah string tersebut adalah palindrom atau
 * bukan. Sebuah string disebut palindrom jika dibaca dari depan dan belakang
 * tetap sama.
 * 
 * Contoh:
 * 
 * Input: katak
 * Output: Palindrom
 * Input: mobil
 * Output: Bukan Palindrom
 */
public class palindromcheckerproblem3 {

    public static boolean isPalidrom(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String checkPalindrom(String input) {
        // Menghapus spasi dan mengubah huruf menjadi huruf kecil
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Memeriksa apakah string adalah palindrom
        if (isPalidrom(processedInput)) {
            return "Palindrom";
        } else {
            return "Bukan Palindrom";
        }
    }

    public static void main(String[] args) {
        String input1 = "Katak";
        String input2 = "Mobil";

        System.out.println("result input1 : " + checkPalindrom(input1));
        System.out.println("result input1 : " + checkPalindrom(input2));
    }
}
