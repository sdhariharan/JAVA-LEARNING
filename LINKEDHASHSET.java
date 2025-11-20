import java.util.LinkedHashSet;
import java.util.Iterator;

public class LINKEDHASHSET {
    public static void main(String[] args) {

        // create LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // --------------------- add() ---------------------
        set.add("Hari");
        set.add("Gokul");
        set.add("Praveen");
        set.add("Hari"); // duplicate -> ignored

        System.out.println("After add(): " + set);

        // --------------------- size() ---------------------
        System.out.println("Size of set: " + set.size());

        // --------------------- contains() ---------------------
        System.out.println("Contains Hari? " + set.contains("Hari"));
        System.out.println("Contains Manoj? " + set.contains("Manoj"));

        // --------------------- remove() ---------------------
        set.remove("Gokul");
        System.out.println("After remove(\"Gokul\"): " + set);

        // --------------------- isEmpty() ---------------------
        System.out.println("Is set empty? " + set.isEmpty());

        // --------------------- iteration using for-each ---------------------
        System.out.println("\nIterating using for-each:");
        for (String s : set) {
            System.out.println(s);
        }

        // --------------------- iteration using iterator() ---------------------
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // --------------------- clone() ---------------------
        LinkedHashSet<String> cloned = (LinkedHashSet<String>) set.clone();
        System.out.println("\nCloned Set: " + cloned);

        // --------------------- addAll() ---------------------
        LinkedHashSet<String> newSet = new LinkedHashSet<>();
        newSet.add("Manoj");
        newSet.add("Arjun");

        set.addAll(newSet);
        System.out.println("\nAfter addAll(): " + set);

        // --------------------- removeAll() ---------------------
        set.removeAll(newSet);
        System.out.println("After removeAll(): " + set);

        // --------------------- clear() ---------------------
        set.clear();
        System.out.println("\nAfter clear(): " + set);
    }
}
