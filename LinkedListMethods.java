import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // -------------------------
        // 1. add() - Add elements
        // -------------------------
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(): " + list);

        // --------------------------------
        // 2. addFirst() / addLast()
        // --------------------------------
        list.addFirst(5);
        list.addLast(40);
        System.out.println("After addFirst & addLast: " + list);

        // -------------------------
        // 3. get() - Access element
        // -------------------------
        System.out.println("get(2): " + list.get(2)); // index 2

        // -------------------------
        // 4. set() - Update element
        // -------------------------
        list.set(2, 99); // replace element at index 2
        System.out.println("After set(): " + list);

        // -------------------------
        // 5. contains()
        // -------------------------
        System.out.println("Contains 99? " + list.contains(99));
        System.out.println("Contains 50? " + list.contains(50));

        // --------------------------------
        // 6. remove() - Remove by index/value
        // --------------------------------
        list.remove(); // removes first element
        System.out.println("After remove() (first): " + list);

        list.remove(1); // remove index 1
        System.out.println("After remove(index): " + list);

        list.remove(Integer.valueOf(40)); // remove object
        System.out.println("After remove(Object): " + list);

        // --------------------------------
        // 7. removeFirst() / removeLast()
        // --------------------------------
        list.add(50);
        list.add(60);
        System.out.println("Before removing: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // -------------------------
        // 8. size()
        // -------------------------
        System.out.println("Size: " + list.size());

        // -------------------------
        // 9. isEmpty()
        // -------------------------
        System.out.println("Is empty? " + list.isEmpty());

        // -------------------------
        // 10. clear()
        // -------------------------
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is empty now? " + list.isEmpty());
    }
}

