import java.util.*;

public class DEQUEUE {
    public static void main(String[] args) {
        // Create a deque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        System.out.println("=== Queue Operations (FIFO) ===");
        deque.add(10);      // add at rear
        deque.add(20);
        deque.offer(30);    // safe add at rear
        System.out.println("Deque: " + deque);

        System.out.println("Peek front: " + deque.peek());
        System.out.println("Poll front: " + deque.poll());
        System.out.println("After poll: " + deque);
        System.out.println("Element at front: " + deque.element());

        System.out.println("\n=== Deque Operations (Both Ends) ===");
        deque.addFirst(5);  // insert at front
        deque.addLast(40);  // insert at rear
        deque.offerFirst(3);
        deque.offerLast(50);
        System.out.println("Deque after addFirst/addLast/offerFirst/offerLast: " + deque);

        System.out.println("RemoveFirst: " + deque.removeFirst());
        System.out.println("RemoveLast: " + deque.removeLast());
        System.out.println("PollFirst: " + deque.pollFirst());
        System.out.println("PollLast: " + deque.pollLast());
        System.out.println("Deque now: " + deque);

        System.out.println("PeekFirst: " + deque.peekFirst());
        System.out.println("PeekLast: " + deque.peekLast());
        System.out.println("GetFirst: " + deque.getFirst());
        System.out.println("GetLast: " + deque.getLast());

        System.out.println("\n=== Stack Operations (LIFO) ===");
        deque.push(100);   // push at front
        deque.push(200);
        System.out.println("After push: " + deque);
        System.out.println("Pop: " + deque.pop());
        System.out.println("After pop: " + deque);

        System.out.println("\n=== Iterators ===");
        deque.add(300);
        deque.add(400);
        System.out.print("Iterator (front to rear): ");
        for (Integer val : deque) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Descending iterator (rear to front): ");
        Iterator<Integer> desc = deque.descendingIterator();
        while (desc.hasNext()) {
            System.out.print(desc.next() + " ");
        }
        System.out.println();

        System.out.println("\n=== Other Methods ===");
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());
        System.out.println("Contains 300? " + deque.contains(300));
        System.out.println("Contains 500? " + deque.contains(500));

        deque.clear();
        System.out.println("After clear, is empty? " + deque.isEmpty());
    }
}

