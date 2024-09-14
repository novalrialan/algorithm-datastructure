package CaseStudy;

import java.util.*;

/**
 * Mengelompokkan dan Mengurutkan Array Berdasarkan Frekuensi Kemunculan
 * 
 * Buatlah sebuah program dalam bahasa pemrograman Java yang menerima input
 * berupa array bilangan bulat. Program harus mengelompokkan elemen-elemen array
 * berdasarkan frekuensi kemunculannya, kemudian mengurutkannya dengan aturan
 * sebagai berikut:
 * 
 * Elemen-elemen yang lebih sering muncul akan diurutkan lebih dulu.
 * Jika dua elemen memiliki frekuensi yang sama, urutkan mereka berdasarkan
 * nilai elemen yang lebih kecil.
 * 
 * Spesifikasi:
 * 
 * Input: Array bilangan bulat yang mungkin berisi elemen yang muncul lebih dari
 * satu kali.
 * Output: Array baru yang telah diurutkan berdasarkan frekuensi kemunculan dan
 * nilai elemen (untuk elemen yang memiliki frekuensi yang sama).
 * 
 * Contoh Input:
 * 
 * java
 * 
 * int[] numbers = {4, 5, 6, 5, 4, 3};
 * 
 * Contoh Output:
 * 
 * javascript
 * 
 * Array Terurut Berdasarkan Frekuensi: [4, 4, 5, 5, 3, 6]
 * 
 * Penjelasan:
 * 
 * Elemen 4 dan 5 muncul 2 kali, sehingga mereka muncul lebih dulu.
 * Elemen 3 dan 6 muncul 1 kali, sehingga mereka berada di belakang.
 * Elemen 4 muncul sebelum 5 karena nilai 4 lebih kecil.
 * 
 * Petunjuk:
 * 
 * Gunakan struktur data seperti HashMap untuk menghitung frekuensi setiap
 * elemen.
 * Gunakan Comparator untuk mengurutkan elemen-elemen array berdasarkan
 * frekuensi kemunculan dan nilai elemen.
 * Cetak hasil akhir setelah pengelompokan dan pengurutan.
 */

public class ArrayHashMap {
    public static int[] sortByFrequency(int[] numbers) {
        // HashMap untuk menyimpan elemen dan frekuensinya
        Map<Integer, Integer> frequency = new HashMap<>();

        // Menghitung frekuensi setiap elemen
        for (int number : numbers) {
            // Membuat pelebelan pada tiap elemen
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }

        // Membuat list dari elemen2 array
        List<Integer> list = new ArrayList<>();
        for (Integer number : numbers) {
            list.add(number);
        }

        // Mengurutkan list berdasarkan frekuensi dan nilai elemen
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int freq1 = frequency.get(num1);
                int freq2 = frequency.get(num2);

                // Jika frekuensi berbeda, urutkan berdasarkan frekuensi (frekuensi yang lebih
                // tinggi lebih dulu)
                if (freq1 != freq2) {
                    // melakukan compare freqkuensi pada element yang besar dan element yang kecil
                    return Integer.compare(freq2, freq1);
                }
                // Jika frekuensi sama, urutkan berdasarkan nilai elemen yang lebih kecil
                return Integer.compare(num1, num2);
            }
        });

        int[] sortedArray = new int[numbers.length];
        for (int i = 0; i < list.size(); i++) {
            sortedArray[i] = list.get(i);
        }
        return sortedArray;
    }

    public static void main(String[] args) {

        int[] numbers = { 4, 5, 6, 5, 4, 3 };

        int[] sortedArray = sortByFrequency(numbers);

        // Menampilkan hasil array terurut
        System.out.println("Array Terurut Berdasarkan Frekuensi: " + Arrays.toString(sortedArray));
    }
}
