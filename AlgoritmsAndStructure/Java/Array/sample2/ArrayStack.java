package Array.sample2;

import java.util.Stack;

/**
 * Stack
 */
public class ArrayStack {

    public static void main(String[] args) {
        // Last in First Out (LEFO)
        Stack<String> stack = new Stack<String>();

        stack.push("BMW");
        stack.push("Corvette");
        stack.push("Lambo");

        System.out.println("peek : " + stack.peek());
        System.out.println("pop : " + stack.pop());

        stack.push("Toyota Cambri");
        System.out.println("peek : " + stack.peek());
    }
}