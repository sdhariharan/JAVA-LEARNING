import java.util.*;

public class PRIORITYQUEUE {
    public static void main(String[] args) {

        // Create PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.offer(5);  // safe insert
        System.out.println("PriorityQueue: " + pq);

        // 2. Peek (head element)
        System.out.println("Peek: " + pq.peek()); // smallest element

        // 3. Remove head
        System.out.println("Removed (remove): " + pq.remove());
        System.out.println("Queue now: " + pq);

        // 4. Poll (safe remove)
        System.out.println("Removed (poll): " + pq.poll());
        System.out.println("Queue now: " + pq);

        // 5. Check size
        System.out.println("Size of queue: " + pq.size());

        // 6. Check if empty
        System.out.println("Is queue empty? " + pq.isEmpty());

        // 7. Check if contains element
        System.out.println("Contains 20? " + pq.contains(20));
        System.out.println("Contains 100? " + pq.contains(100));

        // 8. Iterate over queue
        System.out.print("Iterating elements: ");
        for (Integer num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 9. Remove all elements using poll
        while (!pq.isEmpty()) {
            System.out.println("Polling: " + pq.poll());
        }

        System.out.println("Queue empty? " + pq.isEmpty());
    }
}

