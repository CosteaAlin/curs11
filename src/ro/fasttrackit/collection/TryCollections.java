package ro.fasttrackit.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TryCollections {
    public static void main(String[] args) {
        tryQueue();
        tryStack();
    }

    private static void tryStack() {
        System.out.println("-----Stack------");
        Stack<String> stack= new Stack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }

    private static void tryQueue() {
        System.out.println("----Queue--------");

        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}
