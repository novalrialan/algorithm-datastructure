package Stack;

import java.util.EmptyStackException;

public class StackAlgorithm {

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Menambahkan elemen ke dalam tumpukan
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Menampilkan elemen-elemen tumpukan
        System.out.println("Elemen-elemen tumpukan:");
        stack.display();

        // Menghapus elemen dari tumpukan
        System.out.println("Elemen yang dihapus dari tumpukan: " + stack.pop());

        // Menampilkan elemen-elemen tumpukan setelah penghapusan
        System.out.println("Elemen-elemen tumpukan setelah penghapusan:");
        stack.display();
    }
}

class Stack {
    private static final int MAX_SIZE = 100;
    private int[] stackArray;
    private int top;

    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    // Menambahkan elemen ke dalam tumpukan
    public void push(int item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Tumpukan penuh, tidak dapat menambahkan elemen baru.");
            return;
        }
        stackArray[++top] = item;
    }

    // Menghapus dan mengembalikan elemen yang berada di atas tumpukan
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    // Memeriksa apakah tumpukan kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Menampilkan elemen-elemen tumpukan
    public void display() {
        if (isEmpty()) {
            System.out.println("Tumpukan kosong.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
