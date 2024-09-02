package Array.sample2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Algoritma queue (atau antrian) adalah struktur data yang mengikuti prinsip
 * FIFO (First In, First Out), di mana elemen yang pertama masuk adalah elemen
 * yang pertama keluar. Algoritma ini digunakan dalam berbagai teknik dan
 * aplikasi, di antaranya:
 * 
 * Penjadwalan Proses (Process Scheduling):
 * Dalam sistem operasi, queue digunakan untuk mengelola proses dalam CPU
 * scheduling. Misalnya, Round Robin scheduling menggunakan queue untuk mengatur
 * giliran eksekusi proses.
 * 
 * Manajemen Antrian pada Jaringan (Queue Management in Networking):
 * Dalam jaringan komputer, queue digunakan untuk mengatur pengiriman paket
 * data. Misalnya, router menggunakan queue untuk mengatur antrian paket yang
 * akan dikirimkan atau diterima.
 * 
 * Pemrosesan Batch (Batch Processing):
 * Sistem batch processing menggunakan queue untuk mengelola dan mengeksekusi
 * batch job secara berurutan.
 * 
 * Antrian di Printer atau Layanan I/O:
 * Saat mencetak dokumen, queue digunakan untuk mengatur urutan dokumen yang
 * akan dicetak.
 * 
 * Breadth-First Search (BFS) dalam Graf:
 * Dalam algoritma pencarian Breadth-First Search (BFS), queue digunakan untuk
 * menjelajahi node graf secara berlapis-lapis.
 * 
 * Pengelolaan Buffer (Buffer Management):
 * Queue digunakan untuk mengelola buffer pada sistem multimedia atau streaming
 * data untuk memastikan data diproses dalam urutan yang benar.
 * 
 * Sistem Layanan:
 * Dalam sistem pelayanan seperti antrian di bank atau antrian kendaraan di tol,
 * queue digunakan untuk mengatur layanan berdasarkan urutan kedatangan.
 * 
 * Pemrosesan Data dalam Simulasi:
 * Pada simulasi antrian, seperti simulasi antrean pelanggan di toko atau
 * antrean kendaraan di lampu lalu lintas, queue digunakan untuk mengatur dan
 * menganalisis sistem.
 * 
 * Dengan menggunakan struktur data queue, algoritma tersebut dapat mengelola
 * dan mengatur elemen-elemen berdasarkan urutan masuk mereka, memastikan bahwa
 * operasi dilakukan secara efisien dan sesuai dengan urutan yang diharapkan.
 */
public class ArrayQueque {

    public static void main(String[] args) {
        // Firt in First out (FIFO)
        Queue<String> queue = new LinkedList<>();

        // add elements to the queque
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queque
        System.out.println("Queque : " + queue);

        // remove the element at the front of the queque
        String font = queue.remove();
        System.out.println("Removed element : " + font);

        // print the updated queque
        System.out.println("Queque after removal : " + queue);

        // add another element to the queque
        queue.add("date");

        // peek at the element at the front of the queque
        String peeked = queue.peek();
        System.out.println("Peeked element : " + peeked);

        // print the updated queque
        System.out.println("Queque after peek : " + queue);
    }

}
