import java.util.*;

public class LINKEDHASHMAP{
    public static void main(String[] args) {

        // Create LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 1. put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // 2. putIfAbsent()
        map.putIfAbsent(2, "NewFruit"); // will NOT replace because key 2 exists
        map.putIfAbsent(4, "Dates");    // will add because key 4 not exists

        // 3. get()
        System.out.println("get(2): " + map.get(2));

        // 4. getOrDefault()
        System.out.println("getOrDefault(10, 'Not Found'): " + map.getOrDefault(10, "Not Found"));

        // 5. containsKey() and containsValue()
        System.out.println("containsKey(3): " + map.containsKey(3));
        System.out.println("containsValue('Apple'): " + map.containsValue("Apple"));

        // 6. size()
        System.out.println("size(): " + map.size());

        // 7. isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // 8. replace()
        map.replace(1, "Apricot");

        // 9. replace(key, oldValue, newValue)
        map.replace(2, "Banana", "Blueberry");

        // 10. remove(key)
        map.remove(4);

        // 11. remove(key, value)
        map.remove(3, "WrongValue");  // won't remove
        map.remove(3, "Cherry");      // will remove

        // 12. keySet()
        System.out.println("keySet(): " + map.keySet());

        // 13. values()
        System.out.println("values(): " + map.values());

        // 14. entrySet()
        System.out.println("entrySet(): " + map.entrySet());

        // 15. clear()
        map.clear();
        System.out.println("After clear(), isEmpty(): " + map.isEmpty());
        
        
        // -------------------------------
        // ACCESS ORDER LINKEDHASHMAP DEMO
        // -------------------------------
        System.out.println("\nAccess Order LinkedHashMap:");

        LinkedHashMap<Integer, String> accessMap =
            new LinkedHashMap<>(16, 0.75f, true);

        accessMap.put(1, "A");
        accessMap.put(2, "B");
        accessMap.put(3, "C");

        accessMap.get(1); // Access key 1 → moves to end
        accessMap.get(2); // moves to end

        System.out.println(accessMap);
    }
}
