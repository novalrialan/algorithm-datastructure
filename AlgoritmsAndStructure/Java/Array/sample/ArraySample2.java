package  Array.sample;

/**
 * Sample2
 */
public class ArraySample2 {
    private int[] items;
    private int count;

    public ArraySample2(int length){
        items = new int[length];
    }

    public void insert(int item){

        // If the array is full, resize it
        if (items.length == count) {

            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }

            // Set "items" to this new array
            items = newItems;

        }
        // Add the new item at the end
        items[count++] = item;
       
    }

    public void removeAt(int index){
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        // If we find it, return index
        // Otherwise, return -1
        // O(n)
        System.out.println("value count = "+ count);
        for (int i = 0; i < count; i++) {
            if(items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        ArraySample2 numbers = new ArraySample2(3);
        // numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        // numbers.insert(60);
        numbers.print();
        System.out.println("find number 40 in index "+numbers.indexOf(40));
        // numbers.print();

        // ============
        // Vector : 100% - synchronized
        // ArrayList : 50% - not synchronized
    }
}