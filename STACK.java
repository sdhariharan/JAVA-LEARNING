import java.util.*;

public class STACK {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top (peek): " + stack.peek());

        System.out.println("Removed (pop): " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Search 10: " + stack.search(10));
        System.out.println("Is empty? " + stack.empty());
    }
}

