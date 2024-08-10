package BigOnotation.one;

public class BigMain {

    // O(n) space
    public void greet(String[] names) {
        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);

        }
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat instance dari kelas Greeter
        BigMain greeter = new BigMain();

        // Membuat array String berisi nama-nama
        String[] names = { "Alice", "Bob", "Charlie" };

        // Memanggil metode greet dengan array names sebagai argumen
        // B.greet(names);
        greeter.greet(names);
    }

}
