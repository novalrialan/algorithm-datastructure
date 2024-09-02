package Array.sample2.binary;

// Kelas BinaryTree yang berfungsi sebagai wadah bagi Node
public class BinaryTree {
    Node root;

    // Metode untuk menambahkan elemen ke dalam pohon (akses public)
    public void add(int value) {
        root = addRecursive(root, value);
    }

    // Metode rekursif untuk menambahkan elemen (akses private di dalam pohon)
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    // Metode untuk mencetak in-order traversal dari pohon (kiri, akar, kanan)
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        // Menambahkan elemen ke dalam pohon
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        // Mencetak pohon biner (in-order traversal)
        bt.traverseInOrder(bt.root);
    }
}
