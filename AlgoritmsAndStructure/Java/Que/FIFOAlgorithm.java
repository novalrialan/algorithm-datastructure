package Que;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOAlgorithm {

    public static void main(String[] args) {
        FIFOQueue fifo = new FIFOQueue();

        // Menambahkan elemen ke dalam antrian FIFO
        fifo.enqueue(10);
        fifo.enqueue(20);
        fifo.enqueue(30);
        fifo.enqueue(40);

        // Menampilkan elemen-elemen antrian FIFO
        System.out.println("Elemen-elemen antrian FIFO: ");
        fifo.display();

        // Menghapus elemen dari antrian FIFO
        System.out.println("Elemen yang dihapus dari antrian: " + fifo.dequeue());

        // Menampilkan elemen-elemen antrian FIFO setelah penghapusan
        System.out.println("Elemen-elemen antrian FIFO setelah penghapusan: ");
        fifo.display();
    }
}

class FIFOQueue {
    private Queue<Integer> queue;

    public FIFOQueue() {
        queue = new LinkedList<>();
    }

    // Menambahkan elemen ke dalam antrian FIFO
    public void enqueue(int item) {
        queue.add(item);
    }

    // Menghapus dan mengembalikan elemen yang berada di depan antrian FIFO
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return -1;
        }
        return queue.poll();
    }

    // Memeriksa apakah antrian FIFO kosong
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Menampilkan elemen-elemen antrian FIFO
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        for (int item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
