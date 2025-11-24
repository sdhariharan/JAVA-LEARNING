import java.util.*;

public class HASHMAPDEMO {
    public static void main(String[] args) {

        // 1. Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 2. put() - add key-value pair
        map.put("Hari", 25);
        map.put("Bob", 23);       // replaced Asheena with Bob
        map.put("Ravi", 30);
        System.out.println("After put(): " + map);

        // 3. get() - retrieve value by key
        System.out.println("Value for 'Hari': " + map.get("Hari"));

        // 4. getOrDefault() - get value or default if key not found
        System.out.println("Value for 'John' (default 0): " + map.getOrDefault("John", 0));

        // 5. containsKey() and containsValue()
        System.out.println("Contains key 'Ravi'? " + map.containsKey("Ravi"));
        System.out.println("Contains value 23? " + map.containsValue(23));

        // 6. remove() - remove by key
        map.remove("Ravi");
        System.out.println("After remove('Ravi'): " + map);

        // 7. size() and isEmpty()
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());

        // 8. replace() - replace value for a key
        map.replace("Hari", 26);
        System.out.println("After replace('Hari', 26): " + map);

        // 9. putIfAbsent() - add only if key not present
        map.putIfAbsent("Hari", 50); // won't update
        map.putIfAbsent("John", 40); // will add
        System.out.println("After putIfAbsent(): " + map);

        // 10. keySet() - get all keys
        System.out.println("Keys: " + map.keySet());

        // 11. values() - get all values
        System.out.println("Values: " + map.values());

        // 12. entrySet() - get all key-value pairs
        System.out.println("Entries: " + map.entrySet());

        // 13. forEach() - iterate using lambda
        System.out.println("Using forEach():");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 14. compute() - compute new value for key
        map.compute("Hari", (k, v) -> v + 10);
        System.out.println("After compute('Hari'): " + map);

        // 15. computeIfAbsent() - compute value only if key absent
        map.computeIfAbsent("Alice", k -> 35);
        System.out.println("After computeIfAbsent('Alice'): " + map);

        // 16. computeIfPresent() - compute value only if key exists
        map.computeIfPresent("John", (k, v) -> v + 5);
        System.out.println("After computeIfPresent('John'): " + map);

        // 17. merge() - combine values for same key
        map.merge("Hari", 5, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge('Hari', 5): " + map);

        // 18. clear() - remove all entries
        map.clear();
        System.out.println("After clear(): " + map);
    }
}

