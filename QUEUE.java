import java.util.*;

public class QUEUE{
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Insert elements (enqueue)
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        // Peek (front element)
        System.out.println("Front element: " + q.peek());

        // Remove elements (dequeue)
        System.out.println("Removed: " + q.remove());
        System.out.println("Queue after remove: " + q);

        // Offer (same as add but safe)
        q.offer(40);
        q.offer(50);

        System.out.println("Queue: " + q);

        // Poll (removes safely)
        System.out.println("Removed using poll(): " + q.poll());
        System.out.println("Queue now: " + q);

        // Check empty
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}

