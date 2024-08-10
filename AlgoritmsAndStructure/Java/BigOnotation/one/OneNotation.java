package BigOnotation.one;

public class OneNotation {
    // Run Program using syntax , java OneNotation.java
    // Consept Sample - O(1)

    public static void main(String[] args) {

    }

    public void log(int[] numbers, String[] names) {
        // O(1)
        // System.out.println(numbers[0]);

        // O(2)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);

        // O(n) --> sample 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // O(n) --> sample 2
        for (int number : numbers)
            System.out.println(number);

        // O(2 + n) --> sample 3
        System.out.println(); // O(1)
        for (int number : numbers) // O(n)
            System.out.println(number);
        System.out.println(); // O(1)

        // O(2n) --> sample 4
        for (int number : numbers) // O(n)
            System.out.println(number);
        for (int number : numbers) // O(n)
            System.out.println(number);

        // O(n + m ) --> sample 5

        for (int number : numbers) // O(n)
            System.out.println(number);

        for (String name : names) // O(m)
            System.out.println(name);

        // O(2 + n) ---> sample 6

        System.out.println(); // O(1)
        for (int number : numbers) // O(n)
            System.out.println(number);
        System.out.println(); // O(1)

        // O(n ^ 3) ---> sample 7

        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                for (int third : numbers) // O(n)
                    System.out.println(first + "," + second);

        // O(log n) --> sample 8
        // O(log n) adalah konsep pencarian binary search dimana pencarian data
        // akan dimulai dari tengah berlajut ke menegah sampai mencapai nilai
        // maximumnya
        // contohnya jika ingin mencari angka 10 data dari array objek 10 index array
        // maka
        // pertama-tama akan dimulai dari index yang mendekati angka 10 tersebut
        // yaitu angka 5
        // dan selanjutnya mencari index tengah lagi yaitu 8 dan
        // sampai mendapatkan nilai maximunya yaitu index 10.

        // O(n) space --> sample 9
        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);

        }

    }
}